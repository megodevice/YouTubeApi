package com.iliazusik.youtubeapi.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.iliazusik.youtubeapi.data.repository.PlaylistsRepository

class PlaylistsViewModel(
    private val repository: PlaylistsRepository
): ViewModel() {

    fun getPlaylists() =
        repository.fetchPlaylists()

}