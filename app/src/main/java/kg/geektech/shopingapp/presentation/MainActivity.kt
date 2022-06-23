package kg.geektech.shopingapp.presentation

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import kg.geektech.shopingapp.R
import kg.geektech.shopingapp.domain.entity.ShopItem
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.addShopItem(ShopItem("potato", 14, false))

        findViewById<Button>(R.id.btn).setOnClickListener {
            Toast.makeText(
                this, viewModel.getShopList().toString(),
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}