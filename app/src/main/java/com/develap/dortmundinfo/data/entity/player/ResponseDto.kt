package com.develap.dortmundinfo.data.entity.player

import com.google.gson.annotations.SerializedName

data class ResponseDto(
    @SerializedName("player")
    val player: PlayerDto
)