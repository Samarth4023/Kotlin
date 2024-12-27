fun factorial(num: Int): Long {
    return if (num == 0) 1 else num * factorial(num - 1)
}

fun main() {
    println("Enter a number:")
    val number = readLine()!!.toInt()
    println("Factorial of $number is ${factorial(number)}")
}
