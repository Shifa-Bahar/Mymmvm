package com.example.mvvm.data.repository

import android.provider.ContactsContract
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mvvm.data.network.MyApi
import com.example.mvvm.data.network.response.AuthResponse
import okhttp3.Response
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import kotlin.math.log

class UserRepository {
    suspend fun userLogin(email: String,password :String) : retrofit2.Response<AuthResponse> {
        return MyApi().userLogin(email, password)

    }
}