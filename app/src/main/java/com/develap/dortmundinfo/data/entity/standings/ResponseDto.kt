package com.develap.dortmundinfo.data.entity.standings

import com.google.gson.annotations.SerializedName

data class ResponseDto(
    @SerializedName("league")
    val league: LeagueDto
)