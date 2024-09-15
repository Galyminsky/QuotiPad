package galyaminsky.quotipad.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ShoppingListDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(item: ShoppingListItem)

    /*@Update
    suspend fun updateItem (item: ShoppingListItem)*/

    @Delete
    suspend fun deleteItem(item: ShoppingListItem)

    @Query("SELECT * FROM shop_list_name")
    fun getAllItems(): Flow<List<ShoppingListItem>>


}