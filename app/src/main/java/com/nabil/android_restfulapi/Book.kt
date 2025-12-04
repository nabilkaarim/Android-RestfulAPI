package com.nabil.android_restfulapi

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Book(
    val title: String?,
    val releaseDate: String?,
    val cover: String?,
    val originalTitle: String?,
    val description: String?,
    val pages: Int?
) : Parcelable