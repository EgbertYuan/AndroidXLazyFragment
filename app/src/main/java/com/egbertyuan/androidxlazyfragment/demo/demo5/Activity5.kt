package com.egbertyuan.androidxlazyfragment.demo.demo5

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.egbertyuan.androidxlazyfragment.R
import com.egbertyuan.androidxlazyfragment.ext.loadFragments
import com.egbertyuan.androidxlazyfragment.ext.showHideFragment
import com.egbertyuan.androidxlazyfragment.FRAGMENT_A
import com.egbertyuan.androidxlazyfragment.FRAGMENT_B
import com.egbertyuan.androidxlazyfragment.FRAGMENT_C
import com.egbertyuan.androidxlazyfragment.generateABCFragments


class Activity5 : AppCompatActivity(), View.OnClickListener {

    private lateinit var fragmentsMap: Map<String, Fragment>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_5)
        initView()
    }

    private fun initView() {
        findViewById<Button>(R.id.btn_a).setOnClickListener(this)
        findViewById<Button>(R.id.btn_b).setOnClickListener(this)
        findViewById<Button>(R.id.btn_c).setOnClickListener(this)
        fragmentsMap = generateABCFragments()
        loadFragments(R.id.fl_container, 0, *fragmentsMap.values.toTypedArray())
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btn_a -> {
                showHideFragment(fragmentsMap.getValue(FRAGMENT_A))
            }
            R.id.btn_b -> {
                showHideFragment(fragmentsMap.getValue(FRAGMENT_B))
            }
            R.id.btn_c -> {
                showHideFragment(fragmentsMap.getValue(FRAGMENT_C))
            }
        }
    }
}