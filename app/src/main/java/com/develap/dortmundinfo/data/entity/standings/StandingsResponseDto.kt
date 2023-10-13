package com.develap.dortmundinfo.data.entity.standings

import com.google.gson.annotations.SerializedName

data class StandingsResponseDto(
    @SerializedName("errors")
    val errors: List<Any>,
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