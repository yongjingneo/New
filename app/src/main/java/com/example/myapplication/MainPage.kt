package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.Room.roomSelectDate
import com.example.myapplication.Table.tableSelectDate
import com.example.myapplication.Table.tableSize
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main_page.*

class MainPage : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

        auth = FirebaseAuth.getInstance()

        btnLogOut.setOnClickListener {
            auth.signOut()
            startActivity(Intent(this, Login::class.java))
            finish()
        }

        btnProfile.setOnClickListener {
            startActivity(Intent(this,Profile::class.java))
            //finish()
        }

        btnNext3.setOnClickListener {
            startActivity(Intent(this, tableSize::class.java))
        }

        btnReserveRoom.setOnClickListener {
            startActivity(Intent(this, roomSelectDate::class.java))
        }

        btnMealOrdering.setOnClickListener{
            startActivity(Intent(this,MealOrdering::class.java))
            finish()
        }

        btnRating.setOnClickListener{
            startActivity(Intent(this,Rating::class.java))
            finish()
        }

    }
}
