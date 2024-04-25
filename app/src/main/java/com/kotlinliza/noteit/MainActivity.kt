package com.kotlinliza.noteit

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.kotlinliza.noteit.database.NoteDatabase
import com.kotlinliza.noteit.repository.NoteRespository
import com.kotlinliza.noteit.viewmodel.NoteViewModel
import com.kotlinliza.noteit.viewmodel.NoteViewModelfactory

class MainActivity : AppCompatActivity() {

    lateinit var noteviewModel:NoteViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        setupViewModel()

    }

    private fun setupViewModel(){
        val noteRepository=NoteRespository(NoteDatabase(this))
        val viewModelProviderFactory=NoteViewModelfactory(application,noteRepository)
        noteviewModel=ViewModelProvider(this,viewModelProviderFactory)[NoteViewModel::class.java]
    }
}