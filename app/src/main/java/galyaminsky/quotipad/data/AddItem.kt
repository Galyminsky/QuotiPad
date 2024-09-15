package galyaminsky.quotipad.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "add_item")
data class AddItem(

    @PrimaryKey
    val id: Int? = null,
    val name: String,
    val isCheck: Boolean,
    val listId: Int,

)
