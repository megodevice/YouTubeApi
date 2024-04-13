package com.iliazusik.youtubeapi.di

import com.iliazusik.youtubeapi.data.api.YouTubeApiService
import com.iliazusik.youtubeapi.data.paging.YouTubePlaylistsSource
import org.koin.dsl.module

val pagingSourceModule = module {
    factory { provideYouTubePagingSource(get()) }
}

fun provideYouTubePagingSource(apiService: YouTubeApiService) =
    YouTubePlaylistsSource(apiService)