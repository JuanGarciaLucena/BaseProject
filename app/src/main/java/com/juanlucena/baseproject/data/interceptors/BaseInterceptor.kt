package com.juanlucena.baseproject.data.interceptors

import okhttp3.Interceptor
import okhttp3.Response

class BaseInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {

        val originalRequest = chain.request()

        //Todo: Modify Headers
        val requestBuilder = originalRequest.newBuilder()
            .addHeader("HeaderId", "HeaderValue")
            .build()

        return chain.proceed(requestBuilder)
    }
}