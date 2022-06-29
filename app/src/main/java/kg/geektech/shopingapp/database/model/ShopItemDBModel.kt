package kg.geektech.shopingapp.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shop_item")
class ShopItemDBModel(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var name: String,
    var count: Int,
    var enabled: Boolean
)