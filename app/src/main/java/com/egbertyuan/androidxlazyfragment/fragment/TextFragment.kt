package com.egbertyuan.androidxlazyfragment.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.egbertyuan.androidxlazyfragment.LazyFragment
import com.egbertyuan.androidxlazyfragment.R

const val ARG_STR = "text"

open class TextFragment : LazyFragment() {

    companion object {
        fun newInstance(text: String) = TextFragment().apply {
            arguments = Bundle().apply { putString(ARG_STR, text) }
            TAG = text
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_text, container, false)

    override fun lazyInit() {
        arguments?.takeIf { it.containsKey(ARG_STR) }?.apply {
            view?.findViewById<TextView>(R.id.tv_text)?.text = getString(ARG_STR)
        }
    }
}