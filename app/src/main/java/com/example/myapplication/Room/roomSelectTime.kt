package com.example.myapplication.Room

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.myapplication.R
import com.example.myapplication.Table.time
import kotlinx.android.synthetic.main.activity_room_select_time.*
import kotlinx.android.synthetic.main.activity_table_select_time.*

lateinit var timeRoom:String
class roomSelectTime : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_select_time)

        val actionbar = supportActionBar
        actionbar!!.title="Time"

        var timeOptions = arrayOf("10:00am-12:00pm", "12:30pm-2:30pm", "3:00pm-5:00pm", "5:30pm-7:30pm", "8:00pm-10:00pm")

        timeOptionRoom.adapter = ArrayAdapter<String>(this,
            R.layout.support_simple_spinner_dropdown_item,timeOptions)

        btnNext31.setOnClickListener {
            recordTime()
        }
    }

    private fun recordTime(){
        if(timeOption.selectedItemPosition == 0){
            timeRoom = "10:00am-12:00pm"
        }
        if(timeOption.selectedItemPosition == 1){
            timeRoom = "12:30pm-2:30pm"
        }
        if(timeOption.selectedItemPosition == 2){
            timeRoom = "3:00pm-5:00pm"
        }
        if(timeOption.selectedItemPosition == 3){
            timeRoom = "5:30pm-7:30pm"
        }
        if(timeOption.selectedItemPosition == 4){
            timeRoom = "8:00pm-10:00pm"
        }
    }
}
