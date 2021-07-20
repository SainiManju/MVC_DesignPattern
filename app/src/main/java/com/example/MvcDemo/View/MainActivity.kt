package com.example.MvcDemo.View

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.MvcDemo.Controller.LoginController
import com.example.MvcDemo.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,ILoginView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginPresenter=LoginController(this)

        loginb.setOnClickListener()
        {
            loginPresenter.OnLogin(email.text.toString().trim(),password.text.toString().trim())
        }
    }

    override fun OnLoginSuccess(message: String?) {

        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }

    override fun OnLoginError(message: String?) {

        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()

    }
}