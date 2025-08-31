package org.example.api

import okhttp3.Interceptor
import okhttp3.Response

class MaskingInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val req = chain.request()
        val urlWithoutKey = req.url.newBuilder().removeAllQueryParameters("key").build()
        println("-> ${req.method} $urlWithoutKey")
        return chain.proceed(req)
    }
}