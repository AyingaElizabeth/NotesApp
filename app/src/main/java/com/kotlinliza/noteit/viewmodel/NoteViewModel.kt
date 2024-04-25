package com.kotlinliza.noteit.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.kotlinliza.noteit.model.Note
import com.kotlinliza.noteit.repository.NoteRespository
import kotlinx.coroutines.launch

class NoteViewModel (app:Application,private val noteRepository:NoteRespository):AndroidViewModel(app){

    fun addNote(note: Note)=
        viewModelScope.launch {
            noteRepository.insertNote(note)
        }

    fun deleteNote(note: Note)=
        viewModelScope.launch {
            noteRepository.deleteNote(note)
        }

    fun updateNote(note: Note)=
        viewModelScope.launch {
            noteRepository.updateNote(note)
        }

    fun getAllNotes()=noteRepository.getAllNotes()

    fun searchNote(query:String?)=
        noteRepository.searchNote(query)
}