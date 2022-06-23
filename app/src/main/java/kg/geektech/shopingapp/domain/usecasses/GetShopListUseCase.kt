package kg.geektech.shopingapp.domain.usecasses

import kg.geektech.shopingapp.domain.entity.ShopItem
import kg.geektech.shopingapp.domain.repository.ShopListRepository

class GetShopListUseCase(private val repository: ShopListRepository) {
    
    fun getShopList() = repository.getShopList()
}
