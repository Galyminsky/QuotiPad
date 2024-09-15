package galyaminsky.quotipad.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [NoteItem::class, ShoppingListItem::class, AddItem::class], version = 1
)

abstract class MainDb : RoomDatabase() {
    abstract val shoppingListDao: ShoppingListDao
    abstract val noteDao: NoteDao
    abstract val addItemDao: AddItemDao
}