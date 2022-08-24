package br.com.fiap.gameslistprof

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    lateinit var buttonLogin: Button
    lateinit var textViewNewUser: TextView
    lateinit var editTextEmail: EditText
    lateinit var editTextPass: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar!!.hide()

        buttonLogin = findViewById(R.id.button_save)
        textViewNewUser = findViewById(R.id.text_view_new_user)
        editTextEmail = findViewById(R.id.edit_text_email)
        editTextPass = findViewById(R.id.edit_text_password)

        buttonLogin.setOnClickListener {
            authenticate()
        }

        textViewNewUser.setOnClickListener {
            val intent = Intent(this, AddUserActivity::class.java)
            startActivity(intent)
        }

    }

    private fun authenticate() {
        // Ler o shared preferences
        val shared = getSharedPreferences("login", MODE_PRIVATE)
        val email = shared.getString("email", "")
        val pass = shared.getString("password", "")

        val emailEdit = editTextEmail.text.toString()
        val passEdit = editTextPass.text.toString()

        val validPass = email.equals(emailEdit) && pass.equals(passEdit)

        if (validPass){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Usuário ou senha incorretos!", Toast.LENGTH_SHORT).show()
        }
    }
}