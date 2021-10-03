package xyz.teamgravity.bottomnavigationbadges

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Navigation(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = "home") {
        composable("home") {
            Home()
        }

        composable("chat") {
            Chat()
        }

        composable("settings") {
            Settings()
        }
    }
}