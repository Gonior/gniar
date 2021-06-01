package com.example.gniar.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Personal::class],
    version = 1
)
abstract class PersonalDB : RoomDatabase() {
    abstract fun personalDao() : PersonalDAO

    companion object {

        @Volatile private var instance : PersonalDB? = null
        private val LOCK = Any()

        operator fun invoke(context : Context) = instance ?: synchronized(LOCK){
            instance ?: buildDatabase(context).also {
                instance = it
            }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(context.applicationContext, PersonalDB::class.java, "me.db").build()
    }
}