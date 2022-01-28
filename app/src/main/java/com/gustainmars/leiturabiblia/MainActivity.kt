package com.gustainmars.leiturabiblia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.gustainmars.leiturabiblia.classes.Capitulo
import com.gustainmars.leiturabiblia.classes.Livro2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listaCaps = listOf(Capitulo(1, 22, true), Capitulo(2, 23, true), Capitulo(3, 18, false), Capitulo(4, 22, false))
        var rute = Livro2("Rute", listaCaps)
        var txtMain = findViewById<TextView>(R.id.txtMain)
        txtMain.text = rute.printLivro()
    }
}