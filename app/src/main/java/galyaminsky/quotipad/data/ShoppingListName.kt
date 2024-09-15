package galyaminsky.quotipad.data
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shopping_list_name")
data class ShoppingListName(
    @PrimaryKey
    val id: Int,
    val name: String,
    val time: String,
    val allItemsCount: Int,
    val allSelectedItemsCount: Int,

)
