package br.senac.noteapp.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NoteDao {
    @Insert
    fun insert(note: Note)

    @Query(value = "Select * from Note")
    fun listAll(): List<Note>

}