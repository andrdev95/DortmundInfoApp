package com.develap.dortmundinfo.di.modules

import android.content.Context
import androidx.room.Room
import com.develap.dortmundinfo.data.db.TeamInfoDb
import com.develap.dortmundinfo.data.db.dao.TeamDao
import com.develap.dortmundinfo.data.db.dao.VenueDao
import com.develap.dortmundinfo.data.repository.TeamInfoRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideTeamDao(context: Context) =
        Room.databaseBuilder(
            context,
            TeamInfoDb::class.java,
            "team_info"
        ).build().teamDao()

    @Singleton
    @Provides
    fun provideVenueDao(context: Context) =
        Room.databaseBuilder(
            context,
            TeamInfoDb::class.java,
            "team_info"
        ).build().venueDao()

    @Provides
    @Singleton
    fun provideRepository(teamDao: TeamDao, venueDao: VenueDao) =
        TeamInfoRepository(teamDao, venueDao)

}