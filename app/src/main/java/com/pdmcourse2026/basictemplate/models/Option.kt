package com.pdmcourse2026.basictemplate.models

import android.R
import io.ktor.http.Url

data class Option (
    val id: Int,
    val imageurl: Url,
    val name: String,
    val votes: R.integer
)