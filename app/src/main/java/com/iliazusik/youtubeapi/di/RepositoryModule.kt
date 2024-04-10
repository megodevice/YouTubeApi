package com.iliazusik.youtubeapi.di

import com.iliazusik.youtubeapi.data.api.YouTubeApiService
import com.iliazusik.youtubeapi.data.repository.PlaylistItemRepository
import com.iliazusik.youtubeapi.data.repository.PlaylistsRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { providePlaylistsRepository(get()) }
    single { providePlaylistItemRepository(get()) }
}

fun providePlaylistsRepository(api: YouTubeApiService) =
    PlaylistsRepository(api)

fun providePlaylistItemRepository(api: YouTubeApiService) =
    PlaylistItemRepository(api)
