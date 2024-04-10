package com.iliazusik.youtubeapi.di

import com.iliazusik.youtubeapi.data.api.YouTubeApiService
import com.iliazusik.youtubeapi.data.service.NetworkService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit

val networkModule = module {
    single { provideLoggingInterceptor() }
    single { provideOkHttpClient(get()) }
    single { provideRetrofit(get()) }
    single { provideApi(get()) }
}

fun provideLoggingInterceptor() = NetworkService.createLoggingInterceptor()

fun provideOkHttpClient(interceptor: HttpLoggingInterceptor) =
    NetworkService.createOkHttpClient(interceptor)

fun provideRetrofit(client: OkHttpClient): Retrofit = NetworkService.createRetrofit(client)

fun provideApi(retrofit: Retrofit): YouTubeApiService =
    NetworkService.createYouTubeApiService(retrofit)