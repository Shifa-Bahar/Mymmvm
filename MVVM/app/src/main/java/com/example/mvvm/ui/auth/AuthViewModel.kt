package com.example.mvvm.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.mvvm.data.repository.UserRepository
import com.example.mvvm.util.Coroutines

class AuthViewModel: ViewModel() {
    var email: String? = null
    var password: String? = null
    var authListner : AuthListner? = null

    fun onLoginButtonClick(view: View){

        authListner?.onStarted()

        if(email.isNullOrBlank() || password.isNullOrBlank()){
            //onFailure
         authListner?.onFailure("invalid email/password")

        }
         //onSucess
        //userrepository is returing response which is livedata that we can observe in our view from here ie viewmodel
//        var loginResponse = UserRepository().userLogin(email!!,password!!)
//        authListner?.onSucess(loginResponse)


        Coroutines.main {
            var response = UserRepository().userLogin(email!!,password!!)
            if(response.isSuccessful){
                authListner?.onSucess(response.body()?.user!!)
            }else{
                authListner?.onFailure("Error ${response.code()} ")
            }

        }
    }
}