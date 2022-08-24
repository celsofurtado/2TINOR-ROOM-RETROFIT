package br.com.fiap.gameslistprof

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class AddUserActivity : AppCompatActivity() {

    lateinit var editTextEmail: EditText
    lateinit var editTextPass: EditText
    lateinit var editTextName: EditText
    lateinit var buttonSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_user)

        editTextEmail = findViewById(R.id.edit_text_email)
        editTextPass = findViewById(R.id.edit_text_password)
        editTextName = findViewById(R.id.edit_text_name)
        buttonSave = findViewById(R.id.button_save)

        buttonSave.setOnClickListener {
            save()
        }

    }

    private fun save() {
        val email = editTextEmail.text.toString()
        val pass = editTextPass.text.toString()
        val name = editTextName.text.toString()

        val shared = getSharedPreferences("login", MODE_PRIVATE)
        val editor = shared.edit()

        editor.putInt("id", 1)
        editor.putString("email", email)
        editor.putString("password", pass)
        editor.putString("name", name)
        editor.commit()

        Toast.makeText(this, "Usuário cadastrado com sucesso!!", Toast.LENGTH_SHORT).show()

    }

}