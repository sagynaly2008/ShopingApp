package kg.geektech.shopingapp.domain.usecasses

import kg.geektech.shopingapp.domain.entity.ShopItem
import kg.geektech.shopingapp.domain.repository.ShopListRepository

class AddShopItemUseCase(private val repository: ShopListRepository) {
    fun addShoppItem(shopItem: ShopItem){
        repository.addShopItem(shopItem)
    }
}