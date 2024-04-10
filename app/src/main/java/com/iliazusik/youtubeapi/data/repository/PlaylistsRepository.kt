package com.iliazusik.youtubeapi.data.repository

import androidx.lifecycle.LiveData
import com.iliazusik.youtubeapi.data.api.YouTubeApiService
import com.iliazusik.youtubeapi.data.base.BaseRepository
import com.iliazusik.youtubeapi.data.models.PlaylistsModel
import com.iliazusik.youtubeapi.data.utils.Constants
import com.iliazusik.youtubeapi.utils.Resource

class PlaylistsRepository(
    private val api: YouTubeApiService
) : BaseRepository() {

    fun fetchPlaylists(): LiveData<Resource<PlaylistsModel>> =
        doRequest {
            api.fetchPlaylists(
                channelId = Constants.CHANNEL_ID,
                part = Constants.PART,
                maxResults = Constants.MAX_RESULTS
            )
        }
}