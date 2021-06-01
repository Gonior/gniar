package com.example.gniar.room

import androidx.room.*

@Dao
interface PersonalDAO {
    @Insert
    fun addData(p : Personal)

    @Update
    fun updateData(p : Personal)

    @Delete
    fun deleteData(p : Personal)


    @Query("SELECT * FROM Personal WHERE id=14")
    fun getDataMe() : Boolean

    @Query("SELECT * FROM Personal WHERE id=14")
    fun getInfo() : Personal
}