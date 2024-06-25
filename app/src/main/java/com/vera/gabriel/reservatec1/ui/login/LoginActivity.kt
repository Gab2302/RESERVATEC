package com.vera.gabriel.reservatec1.ui.login

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.vera.gabriel.reservatec1.databinding.ActivityLoginBinding
import com.vera.gabriel.reservatec1.network.RetrofitClient
import com.vera.gabriel.reservatec1.repository.UserRepository
import com.vera.gabriel.reservatec1.ui.utils.ViewModelFactory
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var googleSignInClient: GoogleSignInClient
    private val loginViewModel: LoginViewModel by viewModels {
        ViewModelFactory(UserRepository(RetrofitClient.instance))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configuración de Google Sign-In
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .build()
        googleSignInClient = GoogleSignIn.getClient(this, gso)

        // Configurar botón de inicio de sesión
        binding.btnSignIn.setOnClickListener {
            signIn()
        }

        // Observa el estado de inicio de sesión
        loginViewModel.loginResult.observe(this) { result ->
            // Manejar el resultado del inicio de sesión
        }
    }

    private fun signIn() {
        val signInIntent = googleSignInClient.signInIntent
        startActivityForResult(signInIntent, RC_SIGN_IN)
    }

    companion object {
        private const val RC_SIGN_IN = 9001
    }
}
