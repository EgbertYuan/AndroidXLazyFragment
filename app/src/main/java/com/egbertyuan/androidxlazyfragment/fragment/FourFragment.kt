package com.egbertyuan.androidxlazyfragment.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.egbertyuan.androidxlazyfragment.LazyFragment
import com.egbertyuan.androidxlazyfragment.R
import com.egbertyuan.androidxlazyfragment.ext.loadFragments
import com.egbertyuan.androidxlazyfragment.ext.showHideFragment
import com.egbertyuan.androidxlazyfragment.FRAGMENT_ONE
import com.egbertyuan.androidxlazyfragment.FRAGMENT_THREE
import com.egbertyuan.androidxlazyfragment.FRAGMENT_TWO
import com.egbertyuan.androidxlazyfragment.generate123Fragments



class FourFragment : LazyFragment(), View.OnClickListener {

    private lateinit var fragmentsMap: Map<String, Fragment>

    companion object {
        fun newInstance() = FourFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_four, container, false)


    override fun lazyInit() {
        view?.findViewById<Button>(R.id.btn_1)?.setOnClickListener(this)
        view?.findViewById<Button>(R.id.btn_2)?.setOnClickListener(this)
        view?.findViewById<Button>(R.id.btn_3)?.setOnClickListener(this)
        fragmentsMap = generate123Fragments()
        loadFragments(R.id.fl_container, 0, *fragmentsMap.values.toTypedArray())
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btn_1 -> {
                showHideFragment(fragmentsMap.getValue(FRAGMENT_ONE))
            }
            R.id.btn_2 -> {
                showHideFragment(fragmentsMap.getValue(FRAGMENT_TWO))
            }
            R.id.btn_3 -> {
                showHideFragment(fragmentsMap.getValue(FRAGMENT_THREE))
            }
        }
    }
}
