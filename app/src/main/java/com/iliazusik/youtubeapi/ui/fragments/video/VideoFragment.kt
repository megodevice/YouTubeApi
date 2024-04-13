package com.iliazusik.youtubeapi.ui.fragments.video

import com.example.youtubeapi.databinding.FragmentVideoBinding
import com.iliazusik.youtubeapi.ui.base.BaseFragment
import com.iliazusik.youtubeapi.ui.viewmodels.VideoViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class VideoFragment : BaseFragment<FragmentVideoBinding, VideoViewModel>(FragmentVideoBinding::inflate) {

    override val viewModel: VideoViewModel by viewModel()

    override fun initialize() {
        super.initialize()
    }

    override fun observe() {
        super.observe()
    }

}