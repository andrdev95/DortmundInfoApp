package com.develap.dortmundinfo.data.entity.standings

import com.google.gson.annotations.SerializedName

data class Goals(
    @SerializedName("against")
    val against: Int,
    @SerializedName("`for`")
    val `for`: Int
)