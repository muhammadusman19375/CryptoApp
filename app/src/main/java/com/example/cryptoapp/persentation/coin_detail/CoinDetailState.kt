package com.example.cryptoapp.persentation.coin_detail

import com.example.cryptoapp.domain.model.Coin
import com.example.cryptoapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
