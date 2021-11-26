package com.example.recycleviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var RecyclerView : RecyclerView
    private lateinit var  contactArrayList : ArrayList<contact>
    lateinit var imgId : Array<Int>
    lateinit var heading : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imgId = arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f
        )
        heading = arrayOf(
            "heading a",
            "heading b",
            "heading c",
            "heading d",
            "heading e",
            "heading f",
            "heading g",
        )
        RecyclerView = findViewById(R.id.rv_con)
        RecyclerView.layoutManager
        contactArrayList = arrayListOf<contact>()
        getUserdata()
    }

    private fun getUserdata() {
        for(i in imgId.indices){
            val contact = contact(imgId[i],heading[i])
            contactArrayList.add(contact)
        }
        RecyclerView.adapter = MyAdapter(contactArrayList)
    }
}