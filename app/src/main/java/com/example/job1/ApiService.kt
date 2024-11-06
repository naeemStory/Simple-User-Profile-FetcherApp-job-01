package com.example.job1



import retrofit2.http.GET
import retrofit2.Call




interface ApiService {
    @GET("users/1")
    fun getUserProfile(): Call<User>
}
