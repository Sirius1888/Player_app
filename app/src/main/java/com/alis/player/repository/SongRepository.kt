package com.alis.player.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.alis.player.models.Song
import com.alis.player.network.api.SongApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SongRepository(private val coverAPI: SongApi) {

    fun fetchSong(): MutableLiveData<MutableList<Song>> {
        val data: MutableLiveData<MutableList<Song>> = MutableLiveData()
        coverAPI.fetchSong()
            .enqueue(object : Callback<MutableList<Song>> {
                override fun onResponse(
                    call: Call<MutableList<Song>>,
                    response: Response<MutableList<Song>>
                ) {
                    data.value = response.body()
                }

                override fun onFailure(call: Call<MutableList<Song>>, t: Throwable) {
                    data.value = null
                }
            })
        return data
    }

}