package br.com.covidbr.extension

import java.text.SimpleDateFormat
import java.util.*

const val DATE_TIME_FORMAT_ISO_8601 = "yyyy-MM-dd'T'HH:mm:ss"
const val DATE_FORMAT_BR = "dd/MM/yyyy"
const val DATE_FORMAT_US = "yyyy-MM-dd"
const val DATE_TIME_FORMAT_BR = "dd/MM/yyyy HH:mm"

fun Calendar.formatToString(format: String = DATE_FORMAT_US): String {
    val simpleDateFormat = SimpleDateFormat(format, Locale("pt", "BR"))
    return simpleDateFormat.format(time) ?: ""
}

fun String.toCalendar(format: String = DATE_FORMAT_US): Calendar {
    val simpleDateFormat = SimpleDateFormat(format, Locale("pt", "BR"))
    val cal = Calendar.getInstance()
    cal.time = simpleDateFormat.parse(this) ?: Date()
    return cal
}
