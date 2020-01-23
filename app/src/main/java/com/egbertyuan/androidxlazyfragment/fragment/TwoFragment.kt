package com.egbertyuan.androidxlazyfragment.fragment

import android.os.Bundle

class TwoFragment : TextFragment() {

    companion object {
        fun newInstance(text: String) = TwoFragment().apply {
            arguments = Bundle().apply { putString("text", text) }
        }
    }
}
