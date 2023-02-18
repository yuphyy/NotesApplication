package com.example.notioncleancompose.presentation.notes

import com.example.notioncleancompose.domain.Note
import com.example.notioncleancompose.domain.utils.NoteOrder
import com.example.notioncleancompose.domain.utils.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
