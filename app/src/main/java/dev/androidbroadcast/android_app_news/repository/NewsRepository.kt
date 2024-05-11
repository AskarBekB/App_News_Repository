package dev.androidbroadcast.android_app_news.repository

import dev.androidbroadcast.android_app_news.api.RetrofitInstance
import dev.androidbroadcast.android_app_news.db.ArticleDatabase
import dev.androidbroadcast.android_app_news.models.Article

class NewsRepository(val db: ArticleDatabase) {

    suspend fun getHeadLines(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getHeadlines(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.serachForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getFavoriteNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)

}