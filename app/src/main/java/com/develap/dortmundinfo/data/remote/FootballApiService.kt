package com.develap.dortmundinfo.data.remote


import com.develap.dortmundinfo.data.entity.player.PlayersResponse
import com.develap.dortmundinfo.data.entity.standings.Standings
import com.develap.dortmundinfo.data.entity.team.TeamResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface FootballApiService {

    @Headers(
        "x-rapidapi-key: ${ApiKey.KEY}",
        "x-rapidapi-host: ${ApiConstants.API_HOST}"
    )
    @GET("teams")
    fun getTeamById(@Query("id") id: Int): Call<TeamResponse>

    @Headers(
        "x-rapidapi-key: ${ApiKey.KEY}",
        "x-rapidapi-host: ${ApiConstants.API_HOST}"
    )
    @GET("players")
    fun getPlayersByTeam(
        @Query("team") teamId: Int,
        @Query("league") leagueId: Int,
        @Query("season") seasonId: Int,
        @Query("page") pageNum: Int
    ): Call<PlayersResponse>

    @Headers(
        "x-rapidapi-key: ${ApiKey.KEY}",
        "x-rapidapi-host: ${ApiConstants.API_HOST}"
    )
    @GET("standings")
    fun getStandingsByLeague(
        @Query("league") leagueId: Int,
        @Query("season") seasonId: Int,
        @Query("team") teamId: Int,
    ): Call<Standings>

}