package kg.geektech.shopingapp.domain.usecasses

import kg.geektech.shopingapp.domain.repository.ShopListRepository

class RemoveShopItemUseCase(private val repository: ShopListRepository)  {
    fun getShopList() = repository.getShopList()
}