package com.gt.gt5_cw3_pixabay

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixaApi {
    @GET("api/")
    fun searchImage(
        @Query("q") searchWord:String,
        @Query("key") key: String="38181040-c4d6d5b1335cacaec41af88d4",
    @Query("per_page") perPage: Int=3,
        @Query("page")page:Int
        ): Call<PixaModel>
}