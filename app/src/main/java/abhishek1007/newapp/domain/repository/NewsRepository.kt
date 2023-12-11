package abhishek1007.newapp.domain.repository

import abhishek1007.newapp.data.model.news.NewsDTO
import abhishek1007.newapp.util.Resource

interface NewsRepository {

    suspend fun getTopHeadlines(query:Map<String,String>?): Resource<NewsDTO>

    suspend fun getAllNews(query:Map<String,String>?): Resource<NewsDTO>
}