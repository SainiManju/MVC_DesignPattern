package com.example.MvcDemo.Controller

import com.example.MvcDemo.Model.User
import com.example.MvcDemo.View.ILoginView

class LoginController(var loginView: ILoginView) : ILoginController {
    override fun OnLogin(email: String?, password: String?) {
        val user = password?.let { User(email, it) }
        val loginCode = user?.isValid
        if (loginCode == 0) {
            loginView.OnLoginError("Please enter Email")
        } else if (loginCode == 1) {
            loginView.OnLoginError("Please enter A valid Email")
        } else if (loginCode == 2) {
            loginView.OnLoginError("Please enter Password")
        } else if (loginCode == 3) {
            loginView.OnLoginError("Please enter Password greater the 6 char")
        } else {
            loginView.OnLoginSuccess("login Successful")
        }
    }
}