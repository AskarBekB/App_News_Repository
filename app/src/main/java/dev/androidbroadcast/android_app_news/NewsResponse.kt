package dev.androidbroadcast.android_app_news

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)