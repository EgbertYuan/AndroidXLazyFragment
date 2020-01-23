package com.egbertyuan.androidxlazyfragment

import android.util.Log


/**
 * Description: Androidx 下支持懒加载的fragment
 */

abstract class LazyFragment : LogFragment() {

    private var isLoaded = false

    override fun onResume() {
        super.onResume()
        if (!isLoaded && !isHidden) {
            lazyInit()
            Log.d(TAG, "lazyInit:!!!!!!!")
            isLoaded = true
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        isLoaded = false
    }

    abstract fun lazyInit()

}