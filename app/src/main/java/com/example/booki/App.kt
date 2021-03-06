package com.example.booki

import android.app.Application
import androidx.room.Room
import com.example.booki.database.AppDatabase
import com.example.booki.database.DATABASE_NAME

class App: Application() {

    companion object {
        lateinit var db: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(this, AppDatabase::class.java, DATABASE_NAME)
            .build()
    }

}