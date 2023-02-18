package com.example.notioncleancompose.domain.use_case

import com.example.notioncleancompose.domain.Note
import com.example.notioncleancompose.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
   suspend operator fun invoke(note: Note){
       repository.deleteNote(note)
   }
}