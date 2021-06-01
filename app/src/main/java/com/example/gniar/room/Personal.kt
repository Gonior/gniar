package com.example.gniar.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Personal (
    @PrimaryKey
    val id : Int,
    val nama : String,
    val des : String,
    val hobbies : String,
    val makes : String,
    val interest : String,
    val wish : String,
    val cellphone : String,
    )


