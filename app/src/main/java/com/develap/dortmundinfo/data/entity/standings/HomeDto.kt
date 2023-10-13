package com.develap.dortmundinfo.data.entity.standings

import com.google.gson.annotations.SerializedName

data class HomeDto(
    @SerializedName("draw")
    val draw: Int,
    @SerializedName("goals")
    val goals: GoalsDto,
    @SerializedName("lose")
    val lose: Int,
    @SerializedName("played")
    val played: Int,
    @SerializedName("win")
    val win: Int
)