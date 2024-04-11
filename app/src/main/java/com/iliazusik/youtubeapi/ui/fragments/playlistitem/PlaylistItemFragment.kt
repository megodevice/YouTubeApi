package com.iliazusik.youtubeapi.ui.fragments.playlistitem

import androidx.navigation.fragment.navArgs
import com.example.youtubeapi.databinding.FragmentPlaylistItemBinding
import com.iliazusik.youtubeapi.ui.base.BaseFragment
import com.iliazusik.youtubeapi.ui.viewmodels.PlaylistItemViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class PlaylistItemFragment : BaseFragment<
        FragmentPlaylistItemBinding, PlaylistItemViewModel
        >(FragmentPlaylistItemBinding::inflate) {

    override val viewModel: PlaylistItemViewModel by viewModel()
    private val args: PlaylistItemFragmentArgs by navArgs()

    override fun initialize() = with(binding) {
        super.initialize()
        tvPlaylistTitle.text = args.playlistTitle
        tvPlaylistDesc.text = args.playlistDesc
    }

    override fun observe() {
        super.observe()

    }

}