package com.develap.dortmundinfo.data.entity.team

import com.google.gson.annotations.SerializedName

data class Venue(
    @SerializedName("address")
    val address: String,
    @SerializedName("capacity")
    val capacity: Int,
    @SerializedName("city")
    val city: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("surface")
    val surface: String
)