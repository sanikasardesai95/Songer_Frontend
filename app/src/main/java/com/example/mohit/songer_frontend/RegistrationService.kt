package com.example.mohit.songer_frontend

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RegistrationService {
    @POST("users")
    fun addUser(@Body users : Users) : Call<Users>
}