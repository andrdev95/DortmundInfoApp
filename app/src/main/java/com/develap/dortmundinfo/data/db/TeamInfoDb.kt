package com.develap.dortmundinfo.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.develap.dortmundinfo.data.db.dao.TeamDao
import com.develap.dortmundinfo.data.db.dao.VenueDao
import com.develap.dortmundinfo.data.db.table.TeamInfoTable
import com.develap.dortmundinfo.data.db.table.VenueInfoTable
import com.develap.dortmundinfo.data.remote.ApiConstants.VERSION_DB

@Database(entities = [TeamInfoTable::class, VenueInfoTable::class], version = VERSION_DB, exportSchema = false)
abstract class TeamInfoDb : RoomDatabase() {

    abstract fun teamDao(): TeamDao

    abstract fun venueDao(): VenueDao

}
