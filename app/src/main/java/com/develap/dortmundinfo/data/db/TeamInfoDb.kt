package com.develap.dortmundinfo.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.develap.dortmundinfo.data.db.dao.TeamDao
import com.develap.dortmundinfo.data.db.table.TeamInfoTable
import com.develap.dortmundinfo.data.remote.ApiConstants.VERSION_TEAM_DB

@Database(entities = [TeamInfoTable::class], version = VERSION_TEAM_DB, exportSchema = false)
abstract class TeamInfoDb : RoomDatabase() {

    abstract fun teamDao(): TeamDao

}
