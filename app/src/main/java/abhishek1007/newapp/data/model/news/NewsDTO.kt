package abhishek1007.newapp.data.model.news

data class NewsDTO(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)