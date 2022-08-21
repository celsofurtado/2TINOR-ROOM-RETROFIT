package br.com.fiap.gameslistprof

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NewGameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_game)

        supportActionBar!!.title = "Add new game"

    }
}