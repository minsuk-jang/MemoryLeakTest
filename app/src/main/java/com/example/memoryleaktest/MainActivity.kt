package com.example.memoryleaktest

import android.os.Bundle
import com.example.base.BaseActivity
import com.example.memoryleaktest.databinding.ActivityMainBinding


class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindButton()

    }

    private fun bindButton() {
        val dialog  = MainDialogFragment().apply {
            setOnMainDialogFragmentListener(object : MainDialogFragment.OnMainDialogFragmentListener{
                override fun dismiss() {
                    binding.button1.setOnClickListener(null)
                }
            })
        }

        binding.button1.setOnClickListener {
            dialog.show(supportFragmentManager, "tag")
        }
    }
}