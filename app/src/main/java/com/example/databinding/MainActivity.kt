package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import com.example.databinding.databinding.ActivityMainBinding
import com.example.databinding.model.Employee
import com.example.databinding.model.User

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val employee = Employee(
            1, "Android","Kotlin",
            1.500, arrayListOf("Play football", "Read a book"),
            "https://storage.kun.uz/source/thumbnails/_medium/9/Vsez2FkP40JOfopo6VYTF1NLob3NJZ5h_medium.jpg")

        binding.employee = employee
        val list = arrayListOf("Play football", "Read a book")
        binding.user = User("Jon","Have-rt")
        binding.hobbies = list

        binding.handler = MyHandler()

        binding.btn.setOnClickListener {
//            employee.name = "Java"
            binding.invalidateAll()
        }

    }
}