package com.egbertyuan.androidxlazyfragment.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.egbertyuan.androidxlazyfragment.LazyFragment
import com.egbertyuan.androidxlazyfragment.R


class AFragment : LazyFragment() {

    companion object {
        fun newInstance() = AFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_a, container, false)

    override fun lazyInit() {}
}
