package com.develap.dortmundinfo.domain

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.LiveData
import com.develap.dortmundinfo.data.db.table.TeamInfoTable
import com.develap.dortmundinfo.data.entity.team.TeamResponseDto
import com.develap.dortmundinfo.data.remote.ApiConstants.TEAM_ID
import com.develap.dortmundinfo.data.remote.FootballApiService
import com.develap.dortmundinfo.data.repository.TeamInfoRepository
import com.develap.dortmundinfo.utils.Converter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Iterator(
    private val retrofitService: FootballApiService,
    private val teamInfoRepository: TeamInfoRepository
) {

    fun getTeamInfoFromApi() {
        retrofitService.getTeamById(TEAM_ID).enqueue(object : Callback<TeamResponseDto> {
            override fun onResponse(
                call: Call<TeamResponseDto>,
                response: Response<TeamResponseDto>
            ) {
                val teamResponse = Converter.convertTeam(response.body()?.response?.get(0)?.team)
                if (teamResponse != null) {
                    teamInfoRepository.putTeamIfoToDb(teamResponse)
                } else {
                    Log.d(TAG,"Ошибка добавления в БД")
                }
            }

            override fun onFailure(call: Call<TeamResponseDto>, t: Throwable) {
                Log.d(TAG, "Ошибка при выполнении запроса")
            }
        })
    }

    fun getTeamInfoFromDb(): LiveData<TeamInfoTable> = teamInfoRepository.getTeamInfoFromDb()

    fun deleteTeamInfoFromDb() = teamInfoRepository.getTeamInfoFromDb()
}