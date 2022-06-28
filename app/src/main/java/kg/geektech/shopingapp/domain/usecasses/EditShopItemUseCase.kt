package kg.geektech.shopingapp.domain.usecasses

import kg.geektech.shopingapp.domain.entity.ShopItem
import kg.geektech.shopingapp.domain.repository.ShopListRepository

class EditShopItemUseCase(private val repository: ShopListRepository)  {
    fun getShopList(newItem: ShopItem) = repository.getShopList()
}