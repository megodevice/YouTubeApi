package com.iliazusik.youtubeapi.di

import com.iliazusik.youtubeapi.ui.adapters.PlaylistsVideosAdapter
import org.koin.dsl.module

val adapterModule = module {
    factory { providePlaylistsAdapter() }
}

fun providePlaylistsAdapter() =
    PlaylistsVideosAdapter()
