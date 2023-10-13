package com.develap.dortmundinfo.data.entity.standings

import com.google.gson.annotations.SerializedName

data class TeamDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("logo")
    val logo: String,
    @SerializedName("name")
    val name: String
)