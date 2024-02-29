package com.geeks.home_work_7_3_ai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geeks.home_work_7_3_ai.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent.getStringExtra("Key")
        binding.tvMusicName.text = intent

    }
}