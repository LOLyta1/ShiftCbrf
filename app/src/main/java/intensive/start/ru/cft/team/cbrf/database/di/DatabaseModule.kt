package intensive.start.ru.cft.team.cbrf.database.di

import androidx.room.Room
import androidx.room.RoomDatabase
import intensive.start.ru.cft.team.cbrf.DATABASE_NAME
import intensive.start.ru.cft.team.cbrf.database.CurrencyDao
import intensive.start.ru.cft.team.cbrf.database.CurrencyDatabase
import intensive.start.ru.cft.team.cbrf.database.CurrencyDatabaseImpl
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.bind
import org.koin.dsl.module

val databaseModule = module {
    single {
      CurrencyDatabaseImpl(androidApplication())
    } bind CurrencyDatabase::class
}