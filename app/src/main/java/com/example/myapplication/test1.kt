package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_test1.*

class test1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test1)

        btnTest.setOnClickListener {
            saveTest()
        }
    }

    fun saveTest(){
        val name = editText2.text.toString().trim()
        if(name.isEmpty()){
            editText2.error = "Required."
            return
        }

        val ref = FirebaseDatabase.getInstance().getReference("tests")
        val testId = ref.push().key

        val test = name(testId!!,name)

        ref.child(testId).setValue(test).addOnCompleteListener {
            Toast.makeText(applicationContext, "Successful.", Toast.LENGTH_SHORT).show()
        }
    }
}
