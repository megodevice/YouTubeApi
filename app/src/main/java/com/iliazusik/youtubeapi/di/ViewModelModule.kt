package com.iliazusik.youtubeapi.di

import com.iliazusik.youtubeapi.data.repository.PlaylistItemRepository
import com.iliazusik.youtubeapi.data.repository.PlaylistsRepository
import com.iliazusik.youtubeapi.ui.viewmodels.PlaylistItemViewModel
import com.iliazusik.youtubeapi.ui.viewmodels.PlaylistsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel<PlaylistsViewModel> { providePlaylistsViewModel(get()) }
    viewModel<PlaylistItemViewModel> { providePlaylistItemViewModel(get()) }
}

fun providePlaylistsViewModel(repository: PlaylistsRepository) =
    PlaylistsViewModel(repository)

fun providePlaylistItemViewModel(repository: PlaylistItemRepository) =
    PlaylistItemViewModel(repository)