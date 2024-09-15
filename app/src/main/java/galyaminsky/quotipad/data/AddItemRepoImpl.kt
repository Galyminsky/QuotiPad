package galyaminsky.quotipad.data

import kotlinx.coroutines.flow.Flow

class AddItemRepoImpl(private val dao: AddItemDao) : AddItemRepository {
    override suspend fun insertItem(item: AddItem) {
        dao.insertItem(item)
    }

    override suspend fun insertItem(item: ShoppingListItem) {
        dao.insertItem(item)
    }

    override suspend fun deleteItem(item: AddItem) {
        dao.deleteItem(item)
    }

    override fun getAllItemsById(listId: Int): Flow<List<AddItem>> {
        return dao.getAllItemsById(listId)
    }

    override suspend fun getListItemsById(listId: Int): ShoppingListItem {
        return dao.getListItemsById(listId)
    }
}