package com.example.booki.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.booki.Book

const val DATABASE_NAME = "book_store"

@Database(entities = [Book::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun bookDao(): BookDao

}