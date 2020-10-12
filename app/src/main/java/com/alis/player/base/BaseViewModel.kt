package com.alis.player.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class BaseViewModel : ViewModel() {

    var loading = MutableLiveData<Boolean>()
}