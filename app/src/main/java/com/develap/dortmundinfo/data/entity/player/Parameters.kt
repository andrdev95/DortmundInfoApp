package com.develap.dortmundinfo.data.entity.player

import com.google.gson.annotations.SerializedName

data class Parameters(
    @SerializedName("id")
    val id: String,
    @SerializedName("season")
    val season: String
)