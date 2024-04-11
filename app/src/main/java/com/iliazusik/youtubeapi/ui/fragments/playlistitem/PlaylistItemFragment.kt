package com.iliazusik.youtubeapi.ui.fragments.playlistitem

import androidx.navigation.fragment.navArgs
import coil.load
import com.example.youtubeapi.databinding.FragmentPlaylistItemBinding
import com.iliazusik.youtubeapi.ui.base.BaseFragment
import com.iliazusik.youtubeapi.ui.viewmodels.PlaylistItemViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class PlaylistItemFragment : BaseFragment<
        FragmentPlaylistItemBinding, PlaylistItemViewModel
        >(FragmentPlaylistItemBinding::inflate) {

    override val viewModel: PlaylistItemViewModel by viewModel()
    private val args: PlaylistItemFragmentArgs by navArgs()

    override fun initialize() {
        super.initialize()
        binding.ivImage.load(args.imageUrl)
    }

    override fun observe() {
        super.observe()

    }

}