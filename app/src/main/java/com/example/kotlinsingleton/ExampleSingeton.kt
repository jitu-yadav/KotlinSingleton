package com.example.kotlinsingleton

import com.example.kotlinsingleton.models.User

object ExampleSingeton {
    val user: User by lazy {
        User("jituyadav3353@gmail.com", "jitu", "small_image")
    }
}