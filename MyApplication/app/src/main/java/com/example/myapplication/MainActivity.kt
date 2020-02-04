package com.example.myapplication
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding

    private var p:pim =pim()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.myData = p

        binding.button.setOnClickListener {
            addName(it)
        }
    }

    private fun addName(view:View){

        binding.apply {
            p.s = "${n.text.toString()} ,who is ${a.text.toString()} yrs is a ${o.text.toString()}"



            binding.n.visibility = View.GONE
            binding.a.visibility = View.GONE
            binding.o.visibility = View.GONE
            binding.button.visibility = View.GONE

            binding.s.visibility = View.VISIBLE


            invalidateAll()
        }

        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken,0)
    }
}