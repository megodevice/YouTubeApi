package com.iliazusik.youtubeapi.ui.fragments.playlists

import com.example.youtubeapi.databinding.FragmentPlaylistsBinding
import com.iliazusik.youtubeapi.data.adapters.PlaylistsAdapter
import com.iliazusik.youtubeapi.ui.viewmodels.PlaylistsViewModel
import com.iliazusik.youtubeapi.ui.base.BaseFragment
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class PlaylistsFragment : BaseFragment<
        FragmentPlaylistsBinding, PlaylistsViewModel
        >(FragmentPlaylistsBinding::inflate) {

    override val viewModel: PlaylistsViewModel by viewModel()
    private val adapter: PlaylistsAdapter by inject()

    override fun initialize() {
        super.initialize()
        binding.rvPlaylists.adapter = adapter
    }

    override fun observe() {
        super.observe()
        viewModel.getPlaylists().resHandler({  }) {
            adapter.submitList(it.items)
        }
    }
}