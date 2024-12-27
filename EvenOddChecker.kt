fun main() {
    println("Enter a number:")
    val number = readLine()!!.toInt()
    println("$number is ${if (number % 2 == 0) "Even" else "Odd"}.")
}
