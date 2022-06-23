package kg.geektech.shopingapp.presentation

import androidx.lifecycle.ViewModel
import kg.geektech.shopingapp.data.ShopListRepositoryImpl
import kg.geektech.shopingapp.domain.entity.ShopItem
import kg.geektech.shopingapp.domain.usecasses.*

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl()

    private val addShopItemUseCase = AddShopItemUseCase(repository)
    private val getShopListUseCase = GetShopListUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase()
    private val getShopItemUseCase = GetShopItemUseCase()
    private val removeShopItemUseCase = RemoveShopItemUseCase()

    fun addShopItem(shopItem: ShopItem) {
        addShopItemUseCase.addShoppItem(shopItem)
    }

    fun getShopList() = getShopListUseCase.getShopList()

}