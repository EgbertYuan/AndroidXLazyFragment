package com.egbertyuan.androidxlazyfragment.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.egbertyuan.androidxlazyfragment.LazyFragment
import com.egbertyuan.androidxlazyfragment.R
import com.egbertyuan.androidxlazyfragment.demo.adapter.FragmentLazyStatePageAdapter
import com.google.android.material.tabs.TabLayout
import com.egbertyuan.androidxlazyfragment.generateTextFragmentTitles
import com.egbertyuan.androidxlazyfragment.generateTextFragments


class CFragment : LazyFragment() {

    companion object {
        fun newInstance() = CFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_c, container, false)


    override fun lazyInit() {
        view?.let {
            val viewPager = it.findViewById<ViewPager>(R.id.view_pager).apply {
                adapter = FragmentLazyStatePageAdapter(
                    childFragmentManager,
                    generateTextFragments(4),
                    generateTextFragmentTitles(4)
                )
            }
            it.findViewById<TabLayout>(R.id.tab_layout)?.setupWithViewPager(viewPager)
        }

    }
}
