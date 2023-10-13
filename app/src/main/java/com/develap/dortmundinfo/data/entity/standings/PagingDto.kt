package com.develap.dortmundinfo.data.entity.standings

import com.google.gson.annotations.SerializedName

data class PagingDto(
    @SerializedName("current")
    val current: Int,
    @SerializedName("total")
    val total: Int
)