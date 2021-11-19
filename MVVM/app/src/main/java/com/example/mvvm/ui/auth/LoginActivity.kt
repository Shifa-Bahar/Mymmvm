package com.example.mvvm.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm.R
import com.example.mvvm.data.network.response.AuthResponse
import com.example.mvvm.databinding.ActivityLoginBinding
import com.example.mvvm.db.entites.User
import com.example.mvvm.util.toast
import retrofit2.Response

class LoginActivity : AppCompatActivity(),AuthListner {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       val binding : ActivityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        val viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)

        binding.viewmodel = viewModel
        viewModel.authListner = this
    }

    override fun onStarted() {
//        toast("login started")

    }

    override fun onSucess(user: User) {
    toast("${user.name}")

    }

    override fun onFailure(message: String) {
        toast(message)

    }
}