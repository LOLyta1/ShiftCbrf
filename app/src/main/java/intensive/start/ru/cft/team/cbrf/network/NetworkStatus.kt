package intensive.start.ru.cft.team.cbrf.network

sealed class NetworkStatus<T>(){
    class Loading<T>():NetworkStatus<T>()
    class Successful<T>(val data:T):NetworkStatus<T>()
    class Error<T>(val message:String):NetworkStatus<T>()
}