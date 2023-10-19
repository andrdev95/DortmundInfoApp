package com.develap.dortmundinfo.data.entity.standings

import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("league")
    val league: League
)