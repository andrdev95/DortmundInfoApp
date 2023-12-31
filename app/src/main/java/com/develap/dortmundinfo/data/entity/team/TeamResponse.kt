package com.develap.dortmundinfo.data.entity.team

import com.google.gson.annotations.SerializedName

data class TeamResponse(
    @SerializedName("errors")
    val errors: List<Any>,
    @SerializedName("`get`")
    val `get`: String,
    @SerializedName("paging")
    val paging: Paging,
    @SerializedName("parameters")
    val parameters: List<Parameters>,
    @SerializedName("response")
    val response: List<Response>,
    @SerializedName("results")
    val results: Int
)