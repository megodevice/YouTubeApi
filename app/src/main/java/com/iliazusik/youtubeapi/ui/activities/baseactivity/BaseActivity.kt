package com.iliazusik.youtubeapi.ui.activities.baseactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.navigation.fragment.NavHostFragment
import com.example.youtubeapi.R
import com.example.youtubeapi.databinding.ActivityBaseBinding
import com.iliazusik.youtubeapi.data.service.NetworkConnectionService
import com.iliazusik.youtubeapi.ui.helper.UiHelper

class BaseActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBaseBinding
    private val navController by lazy {
        (supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment).navController
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBaseBinding.inflate(layoutInflater)
        setContentView(binding.root)
        internetConnectionChecker()
        initNavigation()
    }

    private fun initNavigation() {
        binding.tvBack.setOnClickListener { navController.navigateUp() }
        navController.addOnDestinationChangedListener { _, dest, _ ->
            when (dest.id) {
                R.id.playlistsFragment -> {
                    binding.toolbar.isVisible = false
                }
                else -> {
                    binding.toolbar.isVisible = true
                }
            }
        }
    }

    private fun internetConnectionChecker() = with(binding) {
        NetworkConnectionService(this@BaseActivity)
            .observe(this@BaseActivity) { isConnected ->
                UiHelper.changeVisibility(!isConnected, ivNoInternet, btTryAgain)
                UiHelper.changeVisibility(isConnected, navHostFragment)
            }
    }
}