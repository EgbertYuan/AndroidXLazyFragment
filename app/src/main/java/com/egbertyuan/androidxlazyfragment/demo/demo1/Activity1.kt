package com.egbertyuan.androidxlazyfragment.demo.demo1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.egbertyuan.androidxlazyfragment.R
import com.egbertyuan.androidxlazyfragment.demo.adapter.FragmentLazyPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.egbertyuan.androidxlazyfragment.generate123FragmentTitles
import com.egbertyuan.androidxlazyfragment.generate123Fragments


class Activity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)
        initView()
    }

    private fun initView() {
        val viewPager = findViewById<ViewPager>(R.id.view_pager).apply {
            adapter = FragmentLazyPagerAdapter(
                supportFragmentManager,
                generate123Fragments().values.toMutableList(),
                generate123FragmentTitles()
            )
        }
        findViewById<TabLayout>(R.id.tab_layout).setupWithViewPager(viewPager)
    }

}