fun fibonacci(n: Int): List<Int> {
    val sequence = mutableListOf(0, 1)
    for (i in 2 until n) {
        sequence.add(sequence[i - 1] + sequence[i - 2])
    }
    return sequence
}

fun main() {
    println("Enter the number of Fibonacci terms:")
    val n = readLine()!!.toInt()
    println("Fibonacci series: ${fibonacci(n)}")
}
