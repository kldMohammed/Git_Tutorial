package com.kldmohammed.gittutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.loginBtn).setOnClickListener {
          val phone= findViewById<EditText>(R.id.phone).text.toString()

           if (Validator.validatePhone(phone)){


           }

        }

    }


}