package galyaminsky.quotipad.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_table")
data class NoteItem(

    @PrimaryKey
    val id: Int? = null,
    val title: String,
    val description: String,
    val time: String,

    )
