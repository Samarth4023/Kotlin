fun calculateSimpleInterest(p: Double, r: Double, t: Double): Double {
    return (p * r * t) / 100
}

fun main() {
    println("Enter Principal, Rate, and Time:")
    val p = readLine()!!.toDouble()
    val r = readLine()!!.toDouble()
    val t = readLine()!!.toDouble()

    println("Simple Interest is: ${calculateSimpleInterest(p, r, t)}")
}
