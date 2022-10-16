import java.time.Month
import java.time.MonthDay
import java.time.Year

data class Date(val year: Int, val month: Int, val day: Int) : Comparable<Date> {
    override operator fun compareTo(other: Date): Int {
        if (this.year > other.year) return 1
        if (this.year < other.year) return -1
        if (this.month > other.month) return 1
        if (this.month < other.month) return -1
        if (this.day > other.day) return 1
        if (this.day < other.day) return -1
        return 0
    }
}


fun Date.IsLeapYear(): Boolean
{
    var leap = false
    leap = when {
        year % 4 == 0 -> {
            when {
                year % 100 == 0 -> year % 400 == 0
                else -> true
            }
        }
        else -> false
    }
    return leap
}

fun Date.IsValid(): Boolean{
    return (this.day < 32) and (this.day > 0) and (this.month > 0) and (this.month < 13)
}




