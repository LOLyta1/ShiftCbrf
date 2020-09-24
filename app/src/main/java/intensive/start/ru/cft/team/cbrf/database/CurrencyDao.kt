package intensive.start.ru.cft.team.cbrf.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import intensive.start.ru.cft.team.cbrf.core.model.entity.Currency

@Dao
abstract class CurrencyDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun saveCurrencyList(list: List<Currency>)

    @Query("SELECT * FROM Currency")
    abstract suspend fun getAllCurrency(): List<Currency>

    @Query("DELETE FROM Currency")
    abstract suspend fun deleteAllCurrency()
}