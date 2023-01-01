package com.route4me.profilescreen

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone

val profileListOfItems =
    listOf(
        "First Name" to "Rufat",
        "Last Name" to "Nasirov",
        "Email" to "rufat.nasirov.2001@gmail.com",
        "Phone Number" to "+994503923234",
        "Gender" to "Male",
        "Customer Number" to "123456789",
        "Admin" to "true"
    )

val profileListOfIcons = listOf(
    Icons.Filled.Person,
    Icons.Filled.Person,
    Icons.Filled.Email,
    Icons.Filled.Phone,
    R.drawable.ic_gender,
    R.drawable.ic_number,
    R.drawable.ic_admin,
)