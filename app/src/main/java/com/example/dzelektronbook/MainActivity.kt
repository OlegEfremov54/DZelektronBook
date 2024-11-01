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
            val inputData ="Я пришел к тебе с приветом,\n" +
                "Рассказать, что солнце встало,\n" +
                "Что оно горячим светом\n" +
                "По листам затрепетало;\n" +
                "\n" +
                "Рассказать, что лес проснулся,\n" +
                "Весь проснулся, веткой каждой,\n" +
                "Каждой птицей встрепенулся\n" +
                "И весенней полон жаждой;\n" +
                "\n" +
                "Рассказать, что с той же страстью,\n" +
                "Как вчера, пришел я снова,\n" +
                "Что душа все так же счастью\n" +
                "И тебе служить готова;\n" +
                "\n" +
                "Рассказать, что отовсюду\n" +
                "На меня весельем веет,\n" +
                "Что не знаю сам, что буду\n" +
                "Петь — но только песня зреет."
            textTV.text = inputData
            Snackbar.make(view, "Данные загружены", Snackbar.LENGTH_SHORT).show()
        }


    }

    fun loadBook(text: String): List<String>{
        var srt = mutableListOf<String>()


    return srt
    }

}