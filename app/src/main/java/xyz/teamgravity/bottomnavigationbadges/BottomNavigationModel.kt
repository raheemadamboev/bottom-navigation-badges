package xyz.teamgravity.bottomnavigationbadges

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavigationModel(
    val name: String,
    val route: String,
    val icon: ImageVector,
    val badgeCount: Int = 0
)
