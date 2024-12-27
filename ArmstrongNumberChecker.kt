fun isArmstrongNumber(num: Int): Boolean {
    val digits = num.toString().map { it.toString().toInt() }
    val sum = digits.sumOf { it.toDouble().pow(digits.size).toInt() }
    return sum == num
}

fun main() {
    println("Enter a number:")
    val number = readLine()!!.toInt()
    println("$number is ${if (isArmstrongNumber(number)) "an Armstrong" else "not an Armstrong"} number.")
}
