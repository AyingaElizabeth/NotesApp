package com.kotlinliza.noteit.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kotlinliza.noteit.repository.NoteRespository

class NoteViewModelfactory(val app:Application,private val noteRespository:NoteRespository) :ViewModelProvider.Factory{
     override fun<T:ViewModel>create(modelClass: Class<T>):T{
         return NoteViewModel(app,noteRespository) as T

     }
}