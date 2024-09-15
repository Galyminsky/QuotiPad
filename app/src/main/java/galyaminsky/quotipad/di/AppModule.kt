package galyaminsky.quotipad.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import galyaminsky.quotipad.data.AddItemRepoImpl
import galyaminsky.quotipad.data.AddItemRepository
import galyaminsky.quotipad.data.MainDb
import galyaminsky.quotipad.data.NoteRepoImpl
import galyaminsky.quotipad.data.NoteRepository
import galyaminsky.quotipad.data.ShoppingListRepoImpl
import galyaminsky.quotipad.data.ShoppingListRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideMainDb(app: Application): MainDb {
        return Room.databaseBuilder(
            app,
            MainDb::class.java,
            "shop_list_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideShopRepo(db: MainDb): ShoppingListRepository {
        return ShoppingListRepoImpl(db.shoppingListDao)
    }

    @Provides
    @Singleton
    fun provideAddItemRepo(db: MainDb): AddItemRepository {
        return AddItemRepoImpl(db.addItemDao)
    }

    @Provides
    @Singleton
    fun provideNoteRepo(db: MainDb): NoteRepository {
        return NoteRepoImpl(db.noteDao)
    }
}