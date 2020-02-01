package com.example.aman_dsc

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.aman_dsc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding

    private var myVar:MyClass = MyClass()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.myData = myVar

        binding.button.setOnClickListener {
            viewSent(it)
        }
    }

    private fun viewSent(view:View){

        binding.apply {
            myVar.sent = "${name.text.toString()}, aged ${age.text.toString()} yrs, is a ${occupation.text.toString()}."
            binding.name.visibility = View.GONE
            binding.age.visibility = View.GONE
            binding.occupation.visibility = View.GONE
            binding.button.visibility = View.GONE
            binding.sent.visibility = View.VISIBLE
            invalidateAll()
        }

        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken,0)
    }
}
