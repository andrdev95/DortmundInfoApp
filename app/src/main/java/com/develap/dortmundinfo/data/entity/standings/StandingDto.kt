package com.develap.dortmundinfo.data.entity.standings

import com.google.gson.annotations.SerializedName

data class StandingDto(
    @SerializedName("all")
    val all: AllDto,
    @SerializedName("away")
    val away: AwayDto,
    @SerializedName("description")
    val description: String,
    @SerializedName("form")
    val form: String,
    @SerializedName("goalsDiff")
    val goalsDiff: Int,
    @SerializedName("group")
    val group: String,
    @SerializedName("home")
    val home: HomeDto,
    @SerializedName("points")
    val points: Int,
    @SerializedName("rank")
    val rank: Int,
    @SerializedName("status")
    val status: String,
    @SerializedName("team")
    val team: TeamDto,
    @SerializedName("update")
    val update: String
)