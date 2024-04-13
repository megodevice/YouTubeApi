package com.iliazusik.youtubeapi.di

import com.iliazusik.youtubeapi.data.api.YouTubeApiService
import com.iliazusik.youtubeapi.data.paging.YouTubePlaylistsSource
import com.iliazusik.youtubeapi.ui.viewmodels.PlaylistItemViewModel
import com.iliazusik.youtubeapi.ui.viewmodels.PlaylistsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel<PlaylistsViewModel> { providePlaylistsViewModel(get()) }
    viewModel<PlaylistItemViewModel> { providePlaylistItemViewModel(get()) }
}

fun providePlaylistsViewModel(youTubePagingSource: YouTubePlaylistsSource) =
    PlaylistsViewModel(youTubePagingSource)

fun providePlaylistItemViewModel(apiService: YouTubeApiService) =
    PlaylistItemViewModel(apiService)