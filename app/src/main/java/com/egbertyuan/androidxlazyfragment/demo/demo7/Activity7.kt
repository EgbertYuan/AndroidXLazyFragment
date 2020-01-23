package com.egbertyuan.androidxlazyfragment.demo.demo7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.egbertyuan.androidxlazyfragment.R
import com.egbertyuan.androidxlazyfragment.demo.adapter.FragmentLazyStateAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.egbertyuan.androidxlazyfragment.generateTextFragments

class Activity7 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_7)
        initView()
    }

    private fun initView() {
        val viewPager2 = findViewById<ViewPager2>(R.id.view_pager2).apply {
            adapter = FragmentLazyStateAdapter(this@Activity7, generateTextFragments(4))
        }
        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            tab.text = "Fragment ${position + 1}"
        }.attach()
    }

}