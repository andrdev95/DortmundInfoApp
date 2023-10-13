package com.develap.dortmundinfo.data.entity.player

import com.google.gson.annotations.SerializedName

data class PlayersResponseDto(
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