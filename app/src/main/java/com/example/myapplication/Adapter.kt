package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication2.R

class Adapter(val array: ArrayList<MyClass>) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        val image: ImageView = item.findViewById(R.id.image)
        val name : TextView = item.findViewById(R.id.name)
        val surname : TextView = item.findViewById(R.id.surName)
//        fdsa
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val myViewHolder =
            LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return ViewHolder(myViewHolder)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(holder.image.context)
            .load(array[position].imageView)
            .into(holder.image)
        holder.name.text = array[position].name
        holder.surname.text = array[position].surname
    }

    override fun getItemCount(): Int {
        return array.size
    }
}