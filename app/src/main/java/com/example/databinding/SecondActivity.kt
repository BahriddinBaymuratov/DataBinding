package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.adapter.DeveloperAdapter
import com.example.databinding.databinding.ActivitySecondBinding
import com.example.databinding.model.Developer

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    lateinit var list: ArrayList<Developer>
    lateinit var developerAdapter: DeveloperAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)

        loadData()
        developerAdapter = DeveloperAdapter(list)
        binding.rv.adapter = developerAdapter
    }

    private fun loadData() {
        list = ArrayList()
        for (i in 1..100) {
            list.add(
                Developer(i,"Android -> $i","https://storage.kun.uz/source/thumbnails/_medium/9/IX4e5BD-zm8JqEhyv8RdK6GdpS4ZtvRD_medium.jpg")
            )
        }
    }
}