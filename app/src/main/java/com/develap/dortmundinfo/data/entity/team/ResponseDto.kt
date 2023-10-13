package com.develap.dortmundinfo.data.entity.team

import com.google.gson.annotations.SerializedName

data class ResponseDto(
    @SerializedName("team")
    val team: TeamDto,
    @SerializedName("venue")
    val venue: VenueDto
)