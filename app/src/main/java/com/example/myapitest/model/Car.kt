package com.example.myapitest.model

data class Location(
  val lat: String,
  val long: String
)

data class Car(
    val id: String,
    val imageUrl: String,
    val year: String,
    val name: String,
    val licence: String,
    val place: Location
)
