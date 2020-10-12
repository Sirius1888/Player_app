package com.alis.player.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity<ViewModel: BaseViewModel>(private val layoutId: Int) : AppCompatActivity() {

    protected abstract val viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)

        setupViews()
        setupObservers()
    }

    abstract fun setupViews()

    abstract fun setupObservers()


}
