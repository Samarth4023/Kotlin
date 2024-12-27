fun isPalindrome(str: String): Boolean {
    return str == str.reversed()
}

fun main() {
    println("Enter a word:")
    val word = readLine()!!
    println("$word is ${if (isPalindrome(word)) "a palindrome" else "not a palindrome"}.")
}
