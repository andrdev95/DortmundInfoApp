package com.develap.dortmundinfo.data.entity.player

import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("player")
    val player: Player
)