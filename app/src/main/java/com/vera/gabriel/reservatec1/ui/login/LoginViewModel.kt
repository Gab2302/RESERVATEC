package com.vera.gabriel.reservatec1.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vera.gabriel.reservatec1.model.LoginResponse
import com.vera.gabriel.reservatec1.repository.UserRepository
import kotlinx.coroutines.launch

class LoginViewModel(private val repository: UserRepository) : ViewModel() {

    private val _loginResult = MutableLiveData<LoginResponse>()
    val loginResult: LiveData<LoginResponse> get() = _loginResult

    fun login(email: String, password: String) {
        viewModelScope.launch {
            val response = repository.login(email, password)
            _loginResult.value = response
        }
    }
}
