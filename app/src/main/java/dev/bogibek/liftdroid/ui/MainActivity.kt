package dev.bogibek.liftdroid.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.bogibek.liftdroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupUi()
    }

    private fun setupUi() {

    }
}