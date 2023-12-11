package abhishek1007.newapp.ui.news

import abhishek1007.newapp.domain.repository.NewsRepository
import abhishek1007.newapp.util.Resource
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    private val newsRepository: NewsRepository
):ViewModel() {

    fun getTopHeadline(query:Map<String,String>?){

        viewModelScope.launch {
          when(val result = newsRepository.getTopHeadlines(query)){
                is Resource.Success -> {
                    println("getTopHeadline Success ${result.data}")
                }
                is Resource.Error -> {
                    println("getTopHeadline Error ${result.message}")
                }
            }
        }

    }

    fun getAllNews(query:Map<String,String>?){

        viewModelScope.launch {
            when(newsRepository.getTopHeadlines(query)){
                is Resource.Success -> {

                }
                is Resource.Error -> {

                }
            }
        }

    }


}