package com.iliazusik.youtubeapi.di

import com.iliazusik.youtubeapi.data.adapters.PlaylistsAdapter
import org.koin.dsl.module

val adapterModule = module {
    single { providePlaylistsAdapter() }
}

fun providePlaylistsAdapter() =
    PlaylistsAdapter()