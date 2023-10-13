package com.develap.dortmundinfo.data.entity.team

import com.google.gson.annotations.SerializedName

data class TeamResponseDto(
    @SerializedName("`get`")
    val `get`: String,
    @SerializedName("paging")
    val paging: PagingDto,
    @SerializedName("parameters")
    val parameters: ParametersDto,
    @SerializedName("response")
    val response: List<ResponseDto>,
    @SerializedName("results")
    val results: Int
)