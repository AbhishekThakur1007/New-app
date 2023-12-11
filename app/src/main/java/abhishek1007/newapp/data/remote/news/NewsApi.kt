package abhishek1007.newapp.data.remote.news

import abhishek1007.newapp.data.model.news.NewsDTO
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface NewsApi {

    @GET("top-headlines")
    suspend fun getTopHeadLines(@QueryMap query:Map<String,String>): NewsDTO

    @GET("everything")
    suspend fun getAllNews(@QueryMap query:Map<String,String>): NewsDTO

}