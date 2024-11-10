package com.example.myapitest

import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.myapitest.service.*
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import br.edu.utfpr.trabalhofinal.ui.theme.TrabalhoFinalTheme
import com.example.myapitest.model.Car
import com.example.myapitest.service.RetrofitClient
import com.example.myapitest.ui.CarApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestLocationPermission()
        setupView()
       // handleOnSuccess(getCars())
        // 1- Criar tela de Login com algum provedor do Firebase (Telefone, Google)
        //      Cadastrar o Seguinte celular para login de test: +5511912345678
        //      Código de verificação: 101010

        // 2- Criar Opção de Logout no aplicativo

        // 3- Integrar API REST /car no aplicativo
        //      API será disponibilida no Github
        //      JSON Necessário para salvar e exibir no aplicativo
        //      O Image Url deve ser uma foto armazenada no Firebase Storage
        //      { "id": "001", "imageUrl":"https://image", "year":"2020/2020", "name":"Gaspar", "licence":"ABC-1234", "place": {"lat": 0, "long": 0} }

        // Opcionalmente trabalhar com o Google Maps ara enviar o place
    }

    override fun onResume() {
        super.onResume()
        fetchItems()
    }

    private fun setupView() {
        // TODO
        fetchItems()
    }

    private fun requestLocationPermission() {
        // TODO
    }

    private fun fetchItems() {
        CoroutineScope(Dispatchers.IO).launch {
            val result = SafeApiCall { RetrofitClient.apiService.getCars() }

            withContext(Dispatchers.Main)
            {
                when (result) {
                    is Result.Error -> handleAPIFailure()
                    is Result.Success -> handleOnSuccess(result.data)
                }

            }
        }
    }
    private fun handleAPIFailure(){
        Toast.makeText(this,
                         "There was an error on Loading the local API!!",
                              Toast.LENGTH_LONG).show()
    }

    @OptIn(ExperimentalMaterial3Api::class)
    private fun handleOnSuccess(lCars: List<Car>) {
        enableEdgeToEdge()
        setContent {
            TrabalhoFinalTheme {
                Scaffold(
                    content = { paddingValues ->
                            CarApp(
                                listCars = lCars,
                                modifier = Modifier.padding(paddingValues)
                            )
                    }
                )
            }
        }
    }
}
