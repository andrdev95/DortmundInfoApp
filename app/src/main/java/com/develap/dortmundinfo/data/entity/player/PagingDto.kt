package com.develap.dortmundinfo.data.entity.player

import com.google.gson.annotations.SerializedName

data class PagingDto(
    @SerializedName("current")
    val current: Int,
    @SerializedName("total")
    val total: Int
)