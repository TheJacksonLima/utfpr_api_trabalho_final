package com.example.myapitest.ui.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapitest.R


@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    onLoginPressed: () -> Unit
) {
    var phoneNumber = remember { mutableStateOf("") }
    var password = remember { mutableStateOf("") }
    var isPasswordVisible = remember { mutableStateOf(false) }

    val customFontFamily = FontFamily(
        Font(R.font.race_freek)
    )
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        BackgroundLoginScreen()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "CAR API",
                fontFamily = customFontFamily,
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.Bold
                ),
                color = Color.White,
                modifier = Modifier.padding(bottom = 100.dp)
            )

            BasicTextField(
                value = phoneNumber.value,
                onValueChange = { phoneNumber.value = it },
                singleLine = true,
                textStyle = TextStyle(fontSize = MaterialTheme.typography.bodyMedium.fontSize),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
                    .background(
                        Color.LightGray.copy(alpha = 0.8f),
                        RoundedCornerShape(8.dp)
                    )
                    .padding(12.dp),
               /* keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Next
                ),*/
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Done,
                    keyboardType =  androidx.compose.ui.text.input.KeyboardType.Number
                ),
                keyboardActions = KeyboardActions(
                    onNext = { /* Handle next action */ }
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            BasicTextField(
                value = password.value,
                onValueChange = { password.value = it },
                singleLine = true,
                textStyle = TextStyle(fontSize = MaterialTheme.typography.bodyMedium.fontSize),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
                    .background(
                        Color.LightGray.copy(alpha = 0.8f),
                        RoundedCornerShape(8.dp)
                    )
                    .padding(12.dp),
                visualTransformation = if (isPasswordVisible.value) VisualTransformation.None
                else PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Done
                ),
                keyboardActions = KeyboardActions(
                    onDone = { /* Handle login action */ }
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                TextButton(
                    onClick = { isPasswordVisible.value = !isPasswordVisible.value }
                ) {
                    Text(text = if (isPasswordVisible.value) "Hide" else "Show",
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(32.dp))

            Button(
                onClick = { onLoginPressed() },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                shape = RoundedCornerShape(8.dp),
            ) {
                Text(
                    text = "Login",
                    fontFamily = customFontFamily,
                    color = Color.White
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLoginScreen() {
    LoginScreen( onLoginPressed = {})
}
