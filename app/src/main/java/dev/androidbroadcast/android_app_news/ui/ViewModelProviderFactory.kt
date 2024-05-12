package dev.androidbroadcast.android_app_news.ui

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dev.androidbroadcast.android_app_news.repository.NewsRepository

class ViewModelProviderFactory(val app: Application, val newsRepository: NewsRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsViewModel(app, newsRepository) as T
    }
}