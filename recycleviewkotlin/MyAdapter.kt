package com.example.recycleviewkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val contact: ArrayList<contact>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//    get the current item and set here
        val currentItem = contact[position]
        holder.titleImageHolder.setImageResource(currentItem.titleImage)
        holder.cont_textHolder.text = currentItem.cont_text

    }

    override fun getItemCount(): Int {
        return contact.size
//       Tells the adapter no of items in recycle wiew
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
//        layout id defined
        val titleImageHolder : ShapeableImageView = itemView.findViewById(R.id.img)
        val cont_textHolder : TextView = itemView.findViewById(R.id.textId)
    }
}


