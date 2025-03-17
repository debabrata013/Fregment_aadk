package com.example.fragment

import android.app.Fragment
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btn_home:Button= findViewById(R.id.btn_home)
        val btn_profile:Button= findViewById(R.id.btn_profile)
        val btn_registration:Button= findViewById(R.id.btn_registration)
        btn_home.setOnClickListener {
            replaeFragment(HomeFragment())
        }
        btn_profile.setOnClickListener {
            replaeFragment(ProfileFragment())
            }
        btn_registration.setOnClickListener {
            replaeFragment(RegFragment())
        }


    }
    private fun replaeFragment(frag:androidx.fragment.app.Fragment) {
       val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView, frag)

        transaction.commit()



    }
}