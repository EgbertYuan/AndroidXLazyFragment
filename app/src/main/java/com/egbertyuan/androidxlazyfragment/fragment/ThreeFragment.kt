package com.egbertyuan.androidxlazyfragment.fragment

import android.os.Bundle


class ThreeFragment : TextFragment() {

    companion object {
        fun newInstance(text: String) = ThreeFragment().apply {
            arguments = Bundle().apply { putString("text", text) }
        }
    }
}
