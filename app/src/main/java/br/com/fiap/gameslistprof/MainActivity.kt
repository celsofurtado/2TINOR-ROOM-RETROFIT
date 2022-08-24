package br.com.fiap.gameslistprof

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    lateinit var fbAddNewGame: FloatingActionButton
    lateinit var textViewWelcome: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()

        fbAddNewGame = findViewById(R.id.fb_add)
        textViewWelcome = findViewById(R.id.text_view_welcome)

        welcome()

        fbAddNewGame.setOnClickListener {
            val intent = Intent(this, NewGameActivity::class.java)
            startActivity(intent)
        }

    }

    private fun welcome() {
        val shared = getSharedPreferences("login", MODE_PRIVATE)

        textViewWelcome.text = "Welcome ${shared.getString("name", "")}"

    }
}