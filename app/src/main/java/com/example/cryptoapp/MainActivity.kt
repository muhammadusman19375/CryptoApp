package com.example.cryptoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cryptoapp.persentation.Screen
import com.example.cryptoapp.persentation.coin_detail.CoinDetailScreen
import com.example.cryptoapp.persentation.coin_list.CoinListScreen
import com.example.cryptoapp.persentation.ui.theme.CryptoAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptoAppTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Screen.CoinListScreen.route
                ) {
                    composable(
                        route = Screen.CoinListScreen.route
                    ) {
                        CoinListScreen(navController)
                    }
                    composable(
                        route = Screen.CoinDetailScreen.route + "/{coinId}"
                    ) {
                        CoinDetailScreen()
                    }
                }
            }
        }
    }
}