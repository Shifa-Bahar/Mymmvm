package com.example.mvvm.ui.auth

import com.example.mvvm.data.network.response.AuthResponse
import com.example.mvvm.db.entites.User
import retrofit2.Response

interface AuthListner {
    fun onStarted()
    fun onSucess(user: User)
    fun onFailure(message: String)
}