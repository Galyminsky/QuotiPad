package galyaminsky.quotipad.data

import kotlinx.coroutines.flow.Flow

interface ShoppingListRepository {

    suspend fun insertItem(item: ShoppingListItem)
    suspend fun deleteItem(item: ShoppingListItem)
    fun getAllItems(): Flow<List<ShoppingListItem>>

}