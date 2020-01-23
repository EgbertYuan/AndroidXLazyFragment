package com.egbertyuan.androidxlazyfragment.demo.demo4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.egbertyuan.androidxlazyfragment.R
import com.egbertyuan.androidxlazyfragment.ext.loadRootFragment
import com.egbertyuan.androidxlazyfragment.fragment.FourFragment


class Activity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)
        initView()
    }

    private fun initView() {
        loadRootFragment(R.id.fl_container, FourFragment.newInstance())
    }
}