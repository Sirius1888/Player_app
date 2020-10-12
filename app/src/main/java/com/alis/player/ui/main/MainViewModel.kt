package com.alis.player.ui.main

import androidx.lifecycle.MutableLiveData
import com.alis.player.base.BaseViewModel
import com.alis.player.models.Song
import com.alis.player.repository.SongRepository

class MainViewModel(private val songRepository: SongRepository) : BaseViewModel() {

    var cover: MutableLiveData<MutableList<Song>> = MutableLiveData()

    init {
        fetchSong()
    }

    private fun fetchSong() {
        cover = songRepository.fetchSong()
    }

    //Есть список песен, нужно сделать открытие на нажатие  в новом активити.
    //Сделать воспроизвдение плеера.
    //Можно использовать библиотеку ExoPlayer

}