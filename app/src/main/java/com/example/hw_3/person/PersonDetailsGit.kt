package com.example.hw_3.person

import com.google.gson.annotations.SerializedName

data class PersonDetailsGit(
    val id: Long,
    val login: String,
    @SerializedName("avatar_url")
    val avatarUrl: String,
    val followers: Int,
    val following: Int,
    val repository: Int,
    val experience: Int
)