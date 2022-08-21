package br.com.fiap.gameslistprof

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {

    lateinit var buttonLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar!!.hide()

        buttonLogin = findViewById(R.id.button_login)

        buttonLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}