package com.iliazusik.youtubeapi.app

import android.app.Application
import com.iliazusik.youtubeapi.di.adapterModule
import com.iliazusik.youtubeapi.di.networkModule
import com.iliazusik.youtubeapi.di.pagingSourceModule
import com.iliazusik.youtubeapi.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(
                networkModule,
                viewModelModule,
                adapterModule,
                pagingSourceModule
            )
        }
    }
}