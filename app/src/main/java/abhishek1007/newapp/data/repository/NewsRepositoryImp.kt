package abhishek1007.newapp.data.repository

import abhishek1007.newapp.data.model.news.NewsDTO
import abhishek1007.newapp.data.remote.news.NewsApi
import abhishek1007.newapp.domain.repository.NewsRepository
import abhishek1007.newapp.util.Resource
import abhishek1007.newapp.util.apiKey
import abhishek1007.newapp.util.countries
import abhishek1007.newapp.util.defNewsCount
import abhishek1007.newapp.util.startPage
import javax.inject.Inject


class NewsRepositoryImp @Inject constructor(private val newsApi: NewsApi): NewsRepository {

    private val defaultTopHeadlinesQueryParam = mapOf<String,String>(
         "country" to (countries["India"]!!),
         "page" to startPage.toString(),
         "pageSize" to defNewsCount.toString(),
         "apiKey" to apiKey
    )

    private val defaultAllNewsQueryParam = mapOf<String,String>(
         "q" to ("${countries[" India "]} AND Technology"),
         "page" to startPage.toString(),
         "pageSize" to defNewsCount.toString(),
        "apiKey" to apiKey
    )

    override suspend fun getTopHeadlines(query:Map<String,String>?):Resource<NewsDTO> {

        val input = query ?: defaultTopHeadlinesQueryParam

        return try{
            Resource.Success(
                data = this.newsApi.getTopHeadLines(input)
            )
        }catch (e:Exception){
            Resource.Error(
                message = e.message ?: "An Unknown Error occurred."
            )
        }
    }

    override suspend fun getAllNews(query:Map<String,String>?):Resource<NewsDTO> {

        val input = query ?: defaultAllNewsQueryParam

        return try {
            Resource.Success(
                data = this.newsApi.getAllNews(input)
            )
        }catch (e:Exception){
            Resource.Error(
                message = e.message ?: "An Unknown Error occurred."
            )
        }
    }

}
