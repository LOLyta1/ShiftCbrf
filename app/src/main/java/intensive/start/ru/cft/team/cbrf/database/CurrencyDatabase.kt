package intensive.start.ru.cft.team.cbrf.database

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import intensive.start.ru.cft.team.cbrf.DATABASE_NAME
import intensive.start.ru.cft.team.cbrf.core.model.entity.Currency
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

@Database(entities = [Currency::class], version = 1)
abstract class CurrencyDatabase:RoomDatabase() {
    abstract val currencyDao: CurrencyDao
}

 class CurrencyDatabaseImpl(private val application: Application)  {
     suspend operator fun invoke(): CurrencyDatabase = withContext(Dispatchers.IO) {
         return@withContext Room.databaseBuilder(
             application.applicationContext,
             CurrencyDatabase::class.java,
             DATABASE_NAME
         ).build()
     }

 }