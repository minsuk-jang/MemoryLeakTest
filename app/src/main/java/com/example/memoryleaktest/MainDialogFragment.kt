package com.example.memoryleaktest

import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.base.BaseDialogFragment
import com.example.memoryleaktest.databinding.DialogMainBinding

val TAG = "timber"

class MainDialogFragment : BaseDialogFragment<DialogMainBinding>(R.layout.dialog_main) {

    interface OnMainDialogFragmentListener {
        fun dismiss()
    }

    private var _listener: OnMainDialogFragmentListener? = null
    fun setOnMainDialogFragmentListener(listener: OnMainDialogFragmentListener?) {
        _listener = listener
    }

    override fun width(): Int {
        return 500
    }

    override fun height(): Int {
        return 500
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onDismiss(dialog: DialogInterface) {
        super.onDismiss(dialog)
        _listener?.dismiss()
    }
}