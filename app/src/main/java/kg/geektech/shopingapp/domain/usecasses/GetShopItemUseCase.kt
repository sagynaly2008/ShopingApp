package kg.geektech.shopingapp.domain.usecasses

import kg.geektech.shopingapp.domain.repository.ShopListRepository

class GetShopItemUseCase(private val repository: ShopListRepository)  {
    fun getShopList() = repository.getShopList()
}