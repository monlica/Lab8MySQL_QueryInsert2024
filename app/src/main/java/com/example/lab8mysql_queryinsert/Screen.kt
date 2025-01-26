package com.example.lab8mysql_queryinsert

sealed class Screen(val route: String, val name: String) {
    data object Home: Screen(route = "home_screen", name = "Home")
    data object Insert: Screen(route = "insert_screen", name = "Insert")
}