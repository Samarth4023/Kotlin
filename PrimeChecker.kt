fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}

fun main() {
    println("Enter a number:")
    val number = readLine()!!.toInt()
    println("$number is ${if (isPrime(number)) "a prime" else "not a prime"} number.")
}
