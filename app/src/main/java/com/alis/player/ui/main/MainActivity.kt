package com.alis.player.ui.main

import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.alis.player.R
import com.alis.player.ui.main.adapters.SongAdapter
import com.alis.player.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : BaseActivity<MainViewModel>(R.layout.activity_main) {

    private lateinit var songAdapter: SongAdapter
    override val viewModel by inject<MainViewModel>()
    override fun setupViews() {
        setupRecycler()
    }

    override fun setupObservers() {
        fetchCover()
    }

    private fun setupRecycler() {
        songAdapter = SongAdapter()
        recycler.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = songAdapter
        }
    }

    private fun fetchCover() {
        viewModel.cover.observe(this, Observer {
            if (!it.isNullOrEmpty()) songAdapter.addAll(it)
        })
    }
}