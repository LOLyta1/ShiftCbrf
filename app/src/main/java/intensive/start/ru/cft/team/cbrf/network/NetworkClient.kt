package intensive.start.ru.cft.team.cbrf.network

interface NetworkClient<T> {
    suspend fun getData(): T
}