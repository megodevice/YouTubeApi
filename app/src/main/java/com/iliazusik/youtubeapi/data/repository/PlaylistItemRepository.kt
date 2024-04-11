package com.iliazusik.youtubeapi.data.repository

import androidx.lifecycle.LiveData
import com.iliazusik.youtubeapi.data.api.YouTubeApiService
import com.iliazusik.youtubeapi.data.base.BaseRepository
import com.iliazusik.youtubeapi.data.models.PlaylistItemModel
import com.iliazusik.youtubeapi.data.utils.Constants
import com.iliazusik.youtubeapi.utils.Resource

class PlaylistItemRepository(
    private val api: YouTubeApiService
) : BaseRepository() {
    fun fetchPlaylistItem(id: String): LiveData<Resource<PlaylistItemModel>> =
        doRequest {
            api.fetchPlaylistItem(
                maxResults = Constants.MAX_RESULTS,
                part = Constants.PART,
                playlistId = id
            )
        }
}