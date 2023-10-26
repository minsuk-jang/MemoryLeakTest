package com.example.memoryleaktest

import android.os.Bundle
import android.view.View
import com.example.base.BaseDialogFragment
import com.example.memoryleaktest.databinding.DialogMainBinding

class MainDialogFragment : BaseDialogFragment<DialogMainBinding>(R.layout.dialog_main) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}