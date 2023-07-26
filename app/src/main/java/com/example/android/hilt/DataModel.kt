package com.example.android.hilt

// Model class
data class DataModel(
    var year: Int = 0,
    var month: Int = 0,
    var day: Int = 0,
    var hour: Int = 0,
    var minute: Int = 0,
    var second: Int = 0,
    var milliseconds: Int = 0,
    var dateTime: String = "",
    var date: String = "",
    var time: String = "",
    var timeZone: String = "",
    var dayOfWeek: String = "",
    var dstActive: String = ""
) : java.io.Serializable
