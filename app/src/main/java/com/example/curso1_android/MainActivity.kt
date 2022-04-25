package com.example.curso1_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val tag = "Estamos en LogAvtivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      /**  val helloText = findViewById<TextView>(R.id.hello_text)
        helloText.text="Hola Chochera" */

        val email = findViewById<EditText>(R.id.email_id)
        val telephone = findViewById<EditText>(R.id.telephone_id)
        val sendButton = findViewById<Button>(R.id.send)

        sendButton.setOnClickListener{
            Log.d(tag,"Haciendo click en el boton send")

          //  val message = "Email : ${email.text}, Teléfono : ${telephone.text}"
          //  Toast.makeText(this,  message,Toast.LENGTH_SHORT).show()
        }


    }

    private fun myCondcionales() {
        val myVariable = "Francia"

        when(myVariable){
            "España" -> {println("El idioma es español++++++++++++++++++++++++++++++++++++++++")}
            "Francia"-> {println("El idioma es frances-------------------------------------------")}
            else -> {println("No conocemos el idioma")}
        }

        val MyEdad = 13

        when(MyEdad){
            0,1,2,3   ->  {println("Eres un bebe")}
            in 3..10  ->  {println("Eres muy niño")}
            in 11..15 ->  {println("Eres uun joven *********************************************")}
            in 16..19 ->  {println("Eres un adulto")}
            else -> {println("No tenemos datos")}
        }

    }

    override fun onDestroy() {
        Log.d(tag, "OnDestroy")
        super.onDestroy()
    }

    override fun onStart() {
        Log.d(tag, "OnStart")
        super.onStart()
    }

    override fun onStop() {
        Log.d(tag, "OnStop")
        super.onStop()
    }

    override fun onResume() {
        Log.d(tag, "OnResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(tag, "OnPause")
        super.onPause()
    }
}
