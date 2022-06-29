package kg.geektech.shopingapp

import android.app.Application
import androidx.room.Room
import kg.geektech.shopingapp.database.local.AppDataBase

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(applicationContext, AppDataBase::class.java, "dataBase").fallbackToDestructiveMigration().build()
    }

    companion object {
        lateinit var db: AppDataBase
    }
}