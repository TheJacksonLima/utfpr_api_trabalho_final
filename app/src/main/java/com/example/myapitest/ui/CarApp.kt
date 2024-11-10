package com.example.myapitest.ui

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.myapitest.model.Car
import com.example.myapitest.service.Result
import com.example.myapitest.service.RetrofitClient
import com.example.myapitest.service.SafeApiCall
import com.example.myapitest.ui.list.ListCarsScreen
import com.example.myapitest.ui.item.ItemCarDetails
import com.example.myapitest.ui.login.LoginScreen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

private object Screens {
    const val LOGIN_SCREEN = "loginScreen"
    const val LIST_CARS = "listCars"
    const val CAR_DETAILS = "detailsCar"
}

object Arguments{
    const val CAR_ID = "idCar"
}

private object Routes {
    const val LOGIN_SCREEN = Screens.LOGIN_SCREEN
    const val LIST_CARS = Screens.LIST_CARS
    const val CAR_DETAILS = "${Screens.CAR_DETAILS}?${Arguments.CAR_ID}={${Arguments.CAR_ID}}"
}

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun CarApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = Screens.LOGIN_SCREEN,
    listCars: List<Car>
)
{

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(route = Routes.LOGIN_SCREEN){
            LoginScreen(onLoginPressed = { navController.navigate(Screens.LIST_CARS) } )
        }

        composable(route = Routes.LIST_CARS){
            ListCarsScreen(
                cars = listCars,
                onCarItemPressed = { car -> navController.navigate("${Routes.CAR_DETAILS}/${car.id}") }
            )
        }

        composable(
            route = "${Routes.CAR_DETAILS}/{${Arguments.CAR_ID}}",
            arguments = listOf( navArgument(name = Arguments.CAR_ID) { type = NavType.IntType } )
            )
       { backStackEntry ->
                 val carId = backStackEntry.arguments?.getInt(Arguments.CAR_ID)
                 if (carId != null){
                     CoroutineScope(Dispatchers.IO).launch {
                         val result = SafeApiCall { RetrofitClient.apiService.getCar(carId) }

                         withContext(Dispatchers.Main)
                         {
                             when (result) {
                                 is Result.Error -> {}
                                 is Result.Success -> ItemCarDetails(car = result.data)
                             }

                         }
                     }

                 }
        }
    }

}

