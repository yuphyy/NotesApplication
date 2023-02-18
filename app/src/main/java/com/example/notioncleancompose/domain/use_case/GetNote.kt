package com.example.notioncleancompose.domain.use_case

import com.example.notioncleancompose.domain.Note
import com.example.notioncleancompose.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}