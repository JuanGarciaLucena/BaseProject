package com.juanlucena.baseproject.data.network

import com.juanlucena.baseproject.BuildConfig
import com.juanlucena.baseproject.data.interceptors.BaseInterceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient{

    fun getClient(baseUrl: String): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(httpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun httpClient(): OkHttpClient {
        return OkHttpClient().newBuilder()
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE
            })
            .addInterceptor(BaseInterceptor())
            .build()
    }
}