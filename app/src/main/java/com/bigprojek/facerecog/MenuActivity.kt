package com.bigprojek.facerecog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        face.setOnClickListener() {
            intent = Intent(this, FaceRecog::class.java)
            startActivity(intent)
        }

        exit.setOnClickListener(){
            finish()
        }

    }
}