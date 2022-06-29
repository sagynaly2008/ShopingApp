package kg.geektech.shopingapp.database.local

import androidx.lifecycle.LiveData
import androidx.room.*
import kg.geektech.shopingapp.database.model.ShopItemDBModel

@Dao
interface ShopItemDao {

    @Query("SELECT * FROM shop_item")
    fun getAll(): LiveData<List<ShopItemDBModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addShopItem(shopItemDBModel: ShopItemDBModel)

    @Delete
    fun deleteShopItem(shopItemDBModel: ShopItemDBModel)

    @Update
    fun editShopItem(shopItemDBModel: ShopItemDBModel)
}