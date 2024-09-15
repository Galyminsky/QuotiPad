package galyaminsky.quotipad.data

import kotlinx.coroutines.flow.Flow

class NoteRepoImpl (private val dao: NoteDao) : NoteRepository {

    override suspend fun insertItem(item: NoteItem) {
        dao.insertItem(item)
    }

    override suspend fun deleteItem(item: NoteItem) {
        dao.deleteItem(item)
    }

    override fun getAllItems(): Flow<List<NoteItem>> {
        return dao.getAllItems()
    }

    override suspend fun getNoteItemsById(id: Int): NoteItem {
        return dao.getNoteItemsById(id)
    }
}