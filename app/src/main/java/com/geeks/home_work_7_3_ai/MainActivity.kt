package com.geeks.home_work_7_3_ai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geeks.home_work_7_3_ai.databinding.ActivityMainBinding
import com.geeks.home_work_7_3_ai.databinding.FragmentFirstBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction().add(R.id.img_container, FirstFragment()).commit()
            supportFragmentManager.beginTransaction().add(R.id.music_list_container, SecondFragment()).commit()
        }
    }
}