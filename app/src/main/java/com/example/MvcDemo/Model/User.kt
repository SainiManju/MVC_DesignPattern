package com.example.MvcDemo.Model

import android.text.TextUtils
import android.util.Patterns

class User(override val email: String?, override val password: String) : IUser {
    override val isValid: Int
        get() = if (TextUtils.isEmpty(email)) 0 else if (!Patterns.EMAIL_ADDRESS.matcher(email)
                .matches()
        ) 1 else if (TextUtils.isEmpty(
                password
            )
        ) 2 else if (password.length <= 6) 3 else -1
}