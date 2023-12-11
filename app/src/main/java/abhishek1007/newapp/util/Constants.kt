package abhishek1007.newapp.util

val countries = mapOf(
    Pair("India","in"),
    Pair("France","fr"),
    Pair("USA","us"),
    Pair("Canada","ca"),
    Pair("New Zealand","nz"),
    Pair("Australia","au"),
    Pair("Brazil","br"),
    Pair("China","cn"),
).apply {
    this.values.sorted()
}

val newsCategory = listOf(
    "business",
    "entertainment",
    "general",
    "health",
    "science",
    "technology",
    "sports",
)

const val startPage = 1
const val defNewsCount = 7
const val apiKey = "2da85969101048769b8f0688db56d0c8"

val sortBy  = listOf(
    "relevancy",
    "popularity",
    "publishedAt"
)


