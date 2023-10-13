package com.develap.dortmundinfo.data.entity.standings

import com.google.gson.annotations.SerializedName

data class ParametersDto(
    @SerializedName("league")
    val league: String,
    @SerializedName("season")
    val season: String
)