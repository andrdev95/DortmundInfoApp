package com.develap.dortmundinfo.di.modules

import android.content.Context
import com.develap.dortmundinfo.data.remote.FootballApiService
import com.develap.dortmundinfo.data.repository.TeamInfoRepository
import com.develap.dortmundinfo.domain.Iterator
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DomainModule(private val context: Context) {

    @Provides
    fun provideContext() = context

    @Singleton
    @Provides
    fun provideIterator(
        teamInfoRepository: TeamInfoRepository,
        footballApiService: FootballApiService,
    ) = Iterator(
        retrofitService = footballApiService,
        teamInfoRepository = teamInfoRepository
    )
}