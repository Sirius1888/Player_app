package com.alis.player.network.api

import com.alis.player.models.Song
import retrofit2.Call
import retrofit2.http.*

interface SongApi {

//    @PUT("studio/{id}")
//    fun editSong(@Path("id") id: String, @Body dto: Song): Call<MutableList<Song>>
//
//    @POST("studio/")
//    fun createSong(@Path("id") id: String, @Body dto: Song): Call<MutableList<Song>>

//    @DELETE("studio/{id}")
//    fun deleteSong(@Path("id") id: String): Call<MutableList<Song>>

    @GET("studio")
    fun fetchSong(): Call<MutableList<Song>>
}