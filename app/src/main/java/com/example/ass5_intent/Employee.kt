package com.example.ass5_intent

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Employee(val name:String, val gender: String, val email: String,  val salary: String) : Parcelable{
}