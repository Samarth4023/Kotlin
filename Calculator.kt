fun main() {
    println("Enter two numbers:")
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()

    println("Choose operation (+, -, *, /):")
    when (readLine()) {
        "+" -> println("Result: ${a + b}")
        "-" -> println("Result: ${a - b}")
        "*" -> println("Result: ${a * b}")
        "/" -> println("Result: ${a / b}")
        else -> println("Invalid operation!")
    }
}