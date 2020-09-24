package intensive.start.ru.cft.team.cbrf.network

sealed class DownloadingStatus<T>(){
    class Loading<T>():DownloadingStatus<T>()
    class Successful<T>(val data:T):DownloadingStatus<T>()
    class Error<T>(val message:String):DownloadingStatus<T>()
}