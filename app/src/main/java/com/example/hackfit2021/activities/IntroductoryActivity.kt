package com.example.hackfit2021.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.hackfit2021.R
import com.example.hackfit2021.fragments.RatingsFragment
import kotlinx.android.synthetic.main.activity_introductory.*

class IntroductoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introductory)
    }


    fun OnSaveBtnClick(view: android.view.View) {
        val name1 = editTextTextPersonName.text.toString()
        val age = editTextNumber.text.toString()

        val intent = Intent(this,MainActivity::class.java)
        intent.putExtra("Name",name1)
        intent.putExtra("age",age)
        startActivity(intent)
//        replaceFragment(RatingsFragment(),true)

    }
//    private fun replaceFragment(fragment: Fragment, istransition:Boolean){
//        val fragmentTransition = this.supportFragmentManager.beginTransaction()
//
//        if (istransition){
//            fragmentTransition.setCustomAnimations(android.R.anim.slide_out_right,android.R.anim.slide_in_left)
//        }
//        fragmentTransition.replace(R.id.container,fragment).addToBackStack(fragment.javaClass.simpleName).commit()
//    }
}