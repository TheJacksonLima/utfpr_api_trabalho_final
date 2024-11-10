package com.example.myapitest.ui.list

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.edu.utfpr.trabalhofinal.ui.theme.TrabalhoFinalTheme
import coil.compose.AsyncImage
import com.example.myapitest.R
import com.example.myapitest.model.Car
import com.example.myapitest.utils.getCars


@Composable
fun ListCarsScreen(
    modifier: Modifier = Modifier,
    cars: List<Car>,
    onCarItemPressed: (Car) -> Unit
) {
    Box(modifier = Modifier.fillMaxSize()) {
        BackgroundListScreen()

        LazyColumn(modifier = modifier.fillMaxSize()) {
            items(cars) { car ->
                ListItem(
                    modifier = modifier.background(Color.Green).clickable { onCarItemPressed() },
                    trailingContent = {},
                    headlineContent = {

                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                        ) {
                            var textPadding = PaddingValues(
                                top = 8.dp,
                                start = 8.dp,
                                end = 8.dp
                            )

                            Spacer(Modifier.size(24.dp))

                            IconButton(
                                modifier = modifier,
                                onClick = onCarItemPressed
                            ) {

                                AsyncImage(
                                    model = car.imageUrl,
                                    placeholder = painterResource(R.drawable.car_place_holder),
                                    error = painterResource(R.drawable.car_place_holder),
                                    contentDescription = "Car image",
                                    modifier = Modifier.size(80.dp),
                                )
                            }

                            Spacer(Modifier.size(24.dp))

                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    modifier = Modifier.padding(textPadding),
                                    text = car.name,
                                    style = typography.bodyMedium,
                                    color = LocalContentColor.current
                                )

                                Text(
                                    modifier = Modifier.padding(textPadding),
                                    text = car.licence,
                                    style = typography.labelSmall,
                                    color = LocalContentColor.current
                                )

                            }
                        }
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ItemCarPreview()
{
    TrabalhoFinalTheme {
        ListCarsScreen(
            cars = getCars(),
            onCarItemPressed = {}
        )
    }

}