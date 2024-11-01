package com.example.dzelektronbook

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import database


class MainActivity : AppCompatActivity() {

    private lateinit var toolbarMain: Toolbar
    private lateinit var textTV:TextView
    private lateinit var inputDataBTN:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        toolbarMain = findViewById(R.id.toolbarMain)
        setSupportActionBar(toolbarMain)
        title = "ДЗ Электронная книга"
        toolbarMain.subtitle = "Версия 1. Сказка или стишок на ночь"
        toolbarMain.setLogo(R.drawable.ic_android_black_24dp)
        textTV=findViewById(R.id.textTV)
        inputDataBTN=findViewById(R.id.inputDataBTN)

        inputDataBTN.setOnClickListener{view ->
            val inputData =database().text
            textTV.text = inputData
            Snackbar.make(view, "Данные загружены", Snackbar.LENGTH_SHORT).show()
        }


    }

    fun loadBook(text: String): List<String>{
        var srt = mutableListOf<String>()


    return srt
    }

}