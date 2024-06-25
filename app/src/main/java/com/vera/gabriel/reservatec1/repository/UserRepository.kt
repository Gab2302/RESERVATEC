package com.vera.gabriel.reservatec1.repository

import com.vera.gabriel.reservatec1.network.ApiService

class UserRepository(private val apiService: ApiService) {
    suspend fun login(email: String, password: String) = apiService.login(email, password)
}
