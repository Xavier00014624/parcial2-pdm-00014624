package com.pdmcourse2026.basictemplate.models

import kotlinx.serialization.Serializable

@Serializable
data class Post(
    val userId: Int,
    val carnet: Int,
)
