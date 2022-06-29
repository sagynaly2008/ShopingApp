package kg.geektech.shopingapp.database.local

import androidx.room.Database
import androidx.room.RoomDatabase
import kg.geektech.shopingapp.database.model.ShopItemDBModel
import kg.geektech.shopingapp.domain.entity.ShopItem

@Database(entities = [ShopItemDBModel::class], version = 1, exportSchema = false)
abstract class AppDataBase : RoomDatabase() {
    abstract fun shopItemDao(): ShopItemDao
}