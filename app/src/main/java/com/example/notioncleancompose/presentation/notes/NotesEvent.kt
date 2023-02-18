package com.example.notioncleancompose.presentation.notes

import com.example.notioncleancompose.domain.Note
import com.example.notioncleancompose.domain.utils.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
