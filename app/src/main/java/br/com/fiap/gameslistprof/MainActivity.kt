package br.com.fiap.gameslistprof

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    lateinit var fbAddNewGame: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()

        fbAddNewGame = findViewById(R.id.fb_add)

        fbAddNewGame.setOnClickListener {
            val intent = Intent(this, NewGameActivity::class.java)
            startActivity(intent)
        }

    }
}