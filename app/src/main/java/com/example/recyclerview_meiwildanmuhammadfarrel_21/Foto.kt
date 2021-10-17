package com.example.recyclerview_meiwildanmuhammadfarrel_21

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Foto(
    val imgfoto: Int,
    val namefoto: String,
    val descfoto: String
) :Parcelable
