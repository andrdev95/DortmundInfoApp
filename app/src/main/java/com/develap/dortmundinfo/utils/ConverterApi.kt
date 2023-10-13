package com.develap.dortmundinfo.utils

import com.develap.dortmundinfo.data.db.table.TeamInfoTable
import com.develap.dortmundinfo.data.entity.team.TeamDto

object Converter {
    fun convertTeam(teamDto: TeamDto?): TeamInfoTable? {

        val result = teamDto?.let {
            TeamInfoTable(
                id = it.id,
                code = it.code,
                logo = it.logo,
                name = it.name,
                founded = it.founded,
                country = it.country
            )
        }
        return result
    }

}