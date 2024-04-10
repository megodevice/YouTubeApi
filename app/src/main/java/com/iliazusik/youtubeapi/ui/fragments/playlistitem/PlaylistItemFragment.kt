package com.iliazusik.youtubeapi.ui.fragments.playlistitem

import com.example.youtubeapi.databinding.FragmentPlaylistItemBinding
import com.iliazusik.youtubeapi.ui.base.BaseFragment
import com.iliazusik.youtubeapi.ui.viewmodels.PlaylistItemViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class PlaylistItemFragment : BaseFragment<
        FragmentPlaylistItemBinding, PlaylistItemViewModel
        >(FragmentPlaylistItemBinding::inflate) {

    override val viewModel: PlaylistItemViewModel by viewModel()

    override fun initialize() {
        super.initialize()

    }

    override fun observe() {
        super.observe()

    }

}