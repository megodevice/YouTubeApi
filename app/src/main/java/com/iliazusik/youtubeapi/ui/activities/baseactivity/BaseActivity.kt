package com.iliazusik.youtubeapi.ui.activities.baseactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.youtubeapi.databinding.ActivityBaseBinding
import com.iliazusik.youtubeapi.data.service.NetworkConnectionService
import com.iliazusik.youtubeapi.ui.helper.UiHelper

class BaseActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBaseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBaseBinding.inflate(layoutInflater)
        setContentView(binding.root)
        internetConnectionChecker()
    }

    private fun internetConnectionChecker() = with(binding) {
        NetworkConnectionService(this@BaseActivity)
            .observe(this@BaseActivity) { isConnected ->
                UiHelper.changeVisibility(!isConnected, ivNoInternet)
                UiHelper.changeVisibility(isConnected, navHostFragment)
            }
    }
}