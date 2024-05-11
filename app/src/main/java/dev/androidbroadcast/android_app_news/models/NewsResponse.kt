package dev.androidbroadcast.android_app_news.models

import dev.androidbroadcast.android_app_news.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)