package com.chukwuwa.uchenna.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Filters : Serializable {
    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("start_year")
    @Expose
    var startYear: Int? = null
    @SerializedName("end_year")
    @Expose
    var endYear: Int? = null
    @SerializedName("gender")
    @Expose
    var gender: String? = null
    @SerializedName("countries")
    @Expose
    var countries: List<String>? = null
    @SerializedName("colors")
    @Expose
    var colors: List<String>? = null
}