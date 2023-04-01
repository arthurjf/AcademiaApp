package br.com.arthurjf.fitfolio.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import br.com.arthurjf.fitfolio.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLogin = findViewById<Button>(R.id.buttonLogin)
        val editTextUsername = findViewById<EditText>(R.id.editTextUsername)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)


        buttonLogin.setOnClickListener{
            if(editTextUsername.text.toString().equals("admin") && editTextPassword.text.toString().equals("admin")){
                Toast.makeText(this, "Logado com sucesso!", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Usuário ou senha incorreta!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}