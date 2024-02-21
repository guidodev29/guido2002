package edu.sv.ufg.fis.amb.hernandezguido

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivitySecundaria : AppCompatActivity() {

    private lateinit var botonAtras : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secundaria)

        botonAtras = findViewById(R.id.btn_volver)

        botonAtras.setOnClickListener{
            finish()
        }
    }
}