package com.develap.dortmundinfo.domain

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.LiveData
import com.develap.dortmundinfo.data.db.table.TeamInfoTable
import com.develap.dortmundinfo.data.entity.team.Team
import com.develap.dortmundinfo.data.entity.team.TeamResponse
import com.develap.dortmundinfo.data.remote.ApiConstants.TEAM_ID
import com.develap.dortmundinfo.data.remote.FootballApiService
import com.develap.dortmundinfo.data.repository.TeamInfoRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Iterator(
    private val retrofitService: FootballApiService,
    private val teamInfoRepository: TeamInfoRepository
) {

    fun getTeamInfoFromApi() {
        Log.d(TAG, "Retrofit начало")
        retrofitService.getTeamById(TEAM_ID).enqueue(object : Callback<TeamResponse> {
            override fun onResponse(
                call: Call<TeamResponse>,
                response: Response<TeamResponse>
            ) {
                val teamResponse = response.body()?.response?.get(0)?.team
                if (teamResponse != null) {
                    val response = convertTeamInfoWithLiveData(teamResponse)
                    teamInfoRepository.putTeamIfoToDb(response)
                } else {
                    Log.d(TAG, "Получен нулевой список")
                }


            }

            override fun onFailure(call: Call<TeamResponse>, t: Throwable) {
                Log.d(TAG, "Ошибка при выполнении запроса на получение инфо о команде")
            }
        })
    }

    fun getTeamInfoFromDb(): LiveData<TeamInfoTable> = teamInfoRepository.getTeamInfoFromDb()

    private fun convertTeamInfoWithLiveData(teamInfo: Team): TeamInfoTable {
        val result = teamInfo.let {
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