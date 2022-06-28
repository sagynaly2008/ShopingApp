package kg.geektech.shopingapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kg.geektech.shopingapp.database.repository.ShopListRepositoryImpl
import kg.geektech.shopingapp.domain.entity.ShopItem
import kg.geektech.shopingapp.domain.usecasses.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val repositoryImpl = ShopListRepositoryImpl()

    private val addShopItemUseCase = AddShopItemUseCase(repositoryImpl)
    private val removeShopItemUseCase = RemoveShopItemUseCase(repositoryImpl)
    private val getShopListUseCase = GetShopListUseCase(repositoryImpl)
    private val editShopItemUseCase = EditShopItemUseCase(repositoryImpl)
    private val getShopItemUseCase = GetShopItemUseCase(repositoryImpl)
    fun getShopList() = repositoryImpl.getShopList()

    fun addShopItem(shopItem: ShopItem) {
        viewModelScope.launch(Dispatchers.IO) {
            addShopItemUseCase.addShoppItem(shopItem)
        }
    }

    fun removeShopItem(shopItem: ShopItem) {
        viewModelScope.launch(Dispatchers.IO) {
            removeShopItemUseCase.getShopList()
        }
    }

    fun editShopItem(shopItem: ShopItem) {
        viewModelScope.launch(Dispatchers.IO) {
            val newItem = with(shopItem) { copy(enable = !enable) }
            editShopItemUseCase.getShopList(newItem)
        }
    }

    fun getShopItem(shopItem: Int): ShopItem? {
        var data: ShopItem? = null
        viewModelScope.launch(Dispatchers.IO) {
            data = getShopItem(shopItem)

        }
        return data
    }
}