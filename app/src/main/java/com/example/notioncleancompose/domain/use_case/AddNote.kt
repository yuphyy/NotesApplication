package com.example.notioncleancompose.domain.use_case

import com.example.notioncleancompose.domain.InvalidNoteException
import com.example.notioncleancompose.domain.Note
import com.example.notioncleancompose.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {
    @kotlin.jvm.Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note){
        if(note.title.isBlank()){
            throw InvalidNoteException("Заголовок не может быть пустым!")
        }
        if(note.content.isBlank()){
            throw InvalidNoteException("Поле не может быть пустым!")
        }

        repository.insertNote(note)
    }
}