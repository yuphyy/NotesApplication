package com.example.notioncleancompose.domain

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.notioncleancompose.ui.theme.*

@Entity
data class Note(
    @PrimaryKey val id: Int? = null,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int
){
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, RedPink, BabyBlue, Violet)
    }
}

class InvalidNoteException(message: String): Exception(message)
