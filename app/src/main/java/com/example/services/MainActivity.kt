package com.example.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.services.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var view:ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        view=binding.root
        setContentView(view)
        binding.playButton.setOnClickListener {
            startService(Intent(this,MusicPlayerService::class.java))
//            if (textView.text.toString().equals("PLAY")) {
//                textView.text = "STOP"
//                startService(Intent(this, MusicPlayerService::class.java))
//            }
//            else if(textView.text.toString().equals("STOP")){
//                textView.text="PLAY"
//                stopService(Intent(this, MusicPlayerService::class.java))
//            }
        }
    }
}