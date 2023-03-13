package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication2.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.myRecycleView)

        val names = ArrayList<MyClass>()
        names += MyClass("","","")
        rv.adapter = Adapter(names)

        val addBtn = findViewById<Button>(R.id.addBtn)
        val name = findViewById<EditText>(R.id.name)
        val surname = findViewById<EditText>(R.id.surName)
        val image = findViewById<EditText>(R.id.image)
        addBtn.setOnClickListener {
            names += MyClass(imageView = image.text.toString(),name = name.text.toString(),surname =  surname.text.toString())
            rv.adapter = Adapter(names)
        }

    }

    fun getList(): ArrayList<MyClass>{
        val list = ArrayList<MyClass>()

        (0..50).forEach {
            list.add(MyClass("", "Name $it", "Surname $it"))
        }

        return list
    }
}