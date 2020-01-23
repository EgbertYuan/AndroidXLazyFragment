package com.egbertyuan.androidxlazyfragment.fragment

import android.os.Bundle

class OneFragment : TextFragment() {

    companion object {
        fun newInstance(text: String) = OneFragment().apply {
            arguments = Bundle().apply { putString("text", text) }
        }
    }
}
