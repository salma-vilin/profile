package com.example.profilsalmavilin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnProfil: CardView = findViewById(R.id.profile)
        val btnAducation: CardView = findViewById(R.id.aducation)
        val btnSkill: CardView = findViewById(R.id.skill)
        val btnPortofolio: CardView = findViewById(R.id.portofolio)
        val btnHobby: CardView = findViewById(R.id.hobby)

        btnProfil.setOnClickListener {
            Toast.makeText(this, "Ini Tombol Profil", Toast.LENGTH_SHORT).show()
        }
        btnAducation.setOnClickListener {
            Toast.makeText(this, "Ini Tombol Aducation", Toast.LENGTH_SHORT).show()
        }
        btnSkill.setOnClickListener {
            Toast.makeText(this, "Ini Skill", Toast.LENGTH_SHORT).show()
        }
        btnPortofolio.setOnClickListener {
            Toast.makeText(this, "Ini Tombol Portofolio", Toast.LENGTH_SHORT).show()
        }
        btnHobby.setOnClickListener {
            Toast.makeText(this, "Ini Tombol Hobby", Toast.LENGTH_SHORT).show()
        }
    }
}