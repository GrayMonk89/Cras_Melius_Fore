package ru.graymonk.crasmeliusfore.presenter.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ru.graymonk.crasmeliusfore.R
import ru.graymonk.crasmeliusfore.app
import ru.graymonk.crasmeliusfore.domain.entities.UserEntity

class MainActivity : AppCompatActivity() {

    lateinit var list: List<UserEntity>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list = app.userRepository.getUsers()
        Log.d("@@@",list[0].toString())
        Log.d("@@@",list[1].toString())
        Log.d("@@@",list[2].toString())
    }
}