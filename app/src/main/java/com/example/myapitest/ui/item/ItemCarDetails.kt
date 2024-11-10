package com.example.myapitest.ui.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.edu.utfpr.trabalhofinal.ui.theme.TrabalhoFinalTheme
import coil.compose.rememberAsyncImagePainter
import com.example.myapitest.R
import com.example.myapitest.model.Car
import com.example.myapitest.utils.getCars

@Composable
fun ItemCarDetails(
    modifier: Modifier = Modifier,
    car: Car
    )
{
    Column(
        modifier = modifier
            .padding(all = 16.dp)
            .imePadding()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
       val formTextFieldModifier = Modifier
           .fillMaxWidth()
           .padding(horizontal = 16.dp, vertical = 8.dp)

       Row(verticalAlignment = Alignment.CenterVertically){
           // Car.imageUrl Display here, image format
           Image(
               painter = rememberAsyncImagePainter(
                   model = car.imageUrl,
                   placeholder = painterResource(R.drawable.car_place_holder),
                   error = painterResource(R.drawable.car_place_holder)
               ),
               contentDescription = "Car Image",
               modifier = Modifier
                   .padding(8.dp)
                   .fillMaxWidth(0.8f),
               contentScale = ContentScale.Crop
           )
       }

       Row(verticalAlignment = Alignment.CenterVertically){
           Column{
               Text(
                   text = car.name,
                   modifier = formTextFieldModifier
               )

               Spacer(Modifier.size(8.dp))

               Text(
                   text = car.year,
                   modifier = formTextFieldModifier
               )

               Spacer(Modifier.size(8.dp))

               Text(
                   text = car.licence,
                   modifier = formTextFieldModifier
               )
           }
       }
    }
}

@Preview(showBackground = true)
@Composable
private fun ItemCarDetailsPreview()
{
    TrabalhoFinalTheme{
        ItemCarDetails(
            car = getCars()[0]
        )
    }

}
