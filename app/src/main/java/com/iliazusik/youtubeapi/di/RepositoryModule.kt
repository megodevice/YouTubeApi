package com.iliazusik.youtubeapi.di

import com.iliazusik.youtubeapi.data.api.YouTubeApiService
import com.iliazusik.youtubeapi.data.repository.VideoRepository
import org.koin.dsl.module

val repositoryModule = module {
    factory { provideVideoRepository(get()) }
}

fun provideVideoRepository(apiService: YouTubeApiService) =
    VideoRepository(apiService)