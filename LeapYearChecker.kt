fun isLeapYear(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
}

fun main() {
    println("Enter a year:")
    val year = readLine()!!.toInt()
    println("$year is ${if (isLeapYear(year)) "a leap year" else "not a leap year"}.")
}
