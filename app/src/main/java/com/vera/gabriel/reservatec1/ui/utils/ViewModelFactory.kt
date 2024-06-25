package com.vera.gabriel.reservatec1.ui.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.vera.gabriel.reservatec1.repository.UserRepository
import com.vera.gabriel.reservatec1.ui.login.LoginViewModel

class ViewModelFactory(private val repository: UserRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return LoginViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
