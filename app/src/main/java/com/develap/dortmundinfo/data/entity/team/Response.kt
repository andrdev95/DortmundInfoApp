package com.develap.dortmundinfo.data.entity.team

import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("team")
    val team: Team,
    @SerializedName("venue")
    val venue: Venue
)