package com.example.memoryleaktest

import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.base.BaseDialogFragment
import com.example.memoryleaktest.databinding.DialogMainBinding

class MainDialogFragment : BaseDialogFragment<DialogMainBinding>(R.layout.dialog_main) {

    override fun width(): Int {
        return 500
    }

    override fun height(): Int {
        return 500
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}