package com.iliazusik.youtubeapi.data.api

import com.iliazusik.youtubeapi.data.models.YouTubeItemsModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface YouTubeApiService {

    @GET("playlists/")
    suspend fun fetchPlaylists(
        @Query("channelId") channelId: String,
        @Query("part") part: String,
        @Query("maxResults") maxResults: Int,
        @Query("pageToken") pageToken: String
    ) : Response<YouTubeItemsModel>

    @GET("playlistItems/")
    suspend fun fetchVideos(
        @Query("part") part: String,
        @Query("playlistId") playlistId: String,
        @Query("maxResults") maxResults: Int,
        @Query("pageToken") pageToken: String
    ) : Response<YouTubeItemsModel>
}