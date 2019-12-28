package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var fomula: TextView
    private var nStr: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fomula = findViewById(R.id.fomula)

        findViewById<Button>(R.id.zero).setOnClickListener {
            fomula.text = "${fomula.text}0"
            nStr += 0
        }
    }

}
