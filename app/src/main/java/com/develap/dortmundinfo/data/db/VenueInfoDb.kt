package com.develap.dortmundinfo.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.develap.dortmundinfo.data.db.dao.VenueDao
import com.develap.dortmundinfo.data.db.table.VenueInfoTable
import com.develap.dortmundinfo.data.remote.ApiConstants

@Database(entities = [VenueInfoTable::class], version = ApiConstants.VERSION_VENUE_DB, exportSchema = false)
abstract class VenueInfoDb : RoomDatabase() {

    abstract fun venueDao(): VenueDao

}