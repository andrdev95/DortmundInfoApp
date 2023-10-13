package com.develap.dortmundinfo.data.repository

import androidx.lifecycle.LiveData
import com.develap.dortmundinfo.data.db.dao.TeamDao
import com.develap.dortmundinfo.data.db.dao.VenueDao
import com.develap.dortmundinfo.data.db.table.TeamInfoTable
import com.develap.dortmundinfo.data.db.table.VenueInfoTable
import java.util.concurrent.Executors

class TeamInfoRepository(
    private val teamDao: TeamDao, private val venueDao: VenueDao
) {
    fun putTeamIfoToDb(teamInfo: TeamInfoTable) {
        Executors.newSingleThreadExecutor().execute {
            teamDao.insertAllTeamInfo(teamInfo)
        }
    }

    fun getTeamInfoFromDb(): LiveData<TeamInfoTable> = teamDao.getAllTeamInfo()

    fun updateTeamInfoDb(teamInfo: TeamInfoTable) {
        Executors.newSingleThreadExecutor().execute {
            teamDao.deleteAllTeamInfo()
            teamDao.insertAllTeamInfo(teamInfo)
        }
    }

    fun deleteAllTeamInfoFromDB() {
        Executors.newSingleThreadExecutor().execute {
            teamDao.deleteAllTeamInfo()
        }
    }

    fun putVenueIfoToDb(venueInfo: VenueInfoTable) {
        Executors.newSingleThreadExecutor().execute {
            venueDao.insertAllVenueInfo(venueInfo)
        }
    }

    fun getVenueInfoFromDb(): LiveData<VenueInfoTable> = venueDao.getVenueInfo()

    fun updateVenueInfoDb(venueInfo: VenueInfoTable) {
        Executors.newSingleThreadExecutor().execute {
            venueDao.deleteAllVenueInfo()
            venueDao.insertAllVenueInfo(venueInfo)
        }
    }

    fun deleteAllVenueInfoFromDB() {
        Executors.newSingleThreadExecutor().execute {
            venueDao.deleteAllVenueInfo()
        }
    }
}