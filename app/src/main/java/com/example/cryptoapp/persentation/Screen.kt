package com.example.cryptoapp.persentation

sealed class Screen(val route:  String) {
    data object CoinListScreen: Screen("coin_list_screen")
    data object CoinDetailScreen: Screen("coin_detail_screen")
}