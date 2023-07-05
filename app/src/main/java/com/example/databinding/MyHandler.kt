package com.example.databinding

import android.view.View
import android.widget.Toast

class MyHandler {

    fun onDelete(view:View){
        Toast.makeText(view.context, "Click", Toast.LENGTH_SHORT).show()
    }
}