package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       var first = FirstFragment()
        var second = SecondFragment()
        var third = ThirdFragment()
/*
        tab1.setOnClickListener{
            setFragment(first)
        }
*/
       but_first.setOnClickListener {
          setFragment(first)

           val transaction = supportFragmentManager.beginTransaction()
           transaction.add(R.id.id_main_layout,first)
           transaction.commit()

       }


        but_second.setOnClickListener {
            setFragment(second)
        }
        but_third.setOnClickListener {
        setFragment(third)

        }
    }
    private fun setFragment(fragment : Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.id_main_layout,fragment)
        transaction.commit()
    }
}