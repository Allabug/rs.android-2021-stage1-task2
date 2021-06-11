package subtask1

import java.time.LocalDate
import java.time.Month
import java.time.format.TextStyle
import java.util.*


class DateFormatter {


    fun toTextDay(day: String, month: String, year: String): String {

        val locale = Locale("ru", "Ru")
        val result: String
        try {
        val date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
        val dayOfWeek = date.dayOfWeek
        val nameDayOfWeek = dayOfWeek.getDisplayName(TextStyle.FULL, locale)

        val monthFormatted = getFormattedMonth(month)
        return "$day $monthFormatted, $nameDayOfWeek"
        } catch (e: Exception) {
            result = "Такого дня не существует"
        }

        return result
    }


    private fun getFormattedMonth(month: String): String {
        val monthInt = month.toInt()
        val monthFormatted = Month.of(monthInt)
        val loc = Locale.forLanguageTag("ru")
        var month = monthFormatted.getDisplayName(TextStyle.FULL_STANDALONE, loc).decapitalize()

        val charLastIndex = month.lastIndex
        if (month[charLastIndex] == 'т') {
            month += 'а'
        } else {
            month = month.replace(month[charLastIndex], 'я')
        }
        return month
    }
}