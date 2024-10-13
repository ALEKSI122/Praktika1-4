package po_kotliny

fun printNumber(n: Int): List<Int> {
    return if (n <= 0) {
        emptyList()
    } else {
        (n downTo 1).toList()
    }
}

fun main() {
    println("№1")
    println(printNumber(0))
    println(printNumber(2))
    println(printNumber(5))

    println("\n№2")
    fun pyramid(n: Int) {
        for (i in 0 until n) {
            val spaces = " ".repeat(n - i - 1)
            val hashes = "#".repeat(2 * i + 1)
            val level = "$spaces$hashes$spaces"
            println(level)
        }
    }
    pyramid(4)
    println() // Для разделения выводов
    pyramid(4)

    println("\n№3")
    fun caesarCipher(text: String, shift: Int): String {
        fun shiftChar(char: Char): Char {
            return when {
                char.isUpperCase() -> {
                    val base = 'A'
                    val newCharIndex = (char - base + shift + 26) % 26
                    (base + newCharIndex)
                }
                char.isLowerCase() -> {
                    val base = 'a'
                    val newCharIndex = (char - base + shift + 26) % 26
                    (base + newCharIndex)
                }
                else -> char
            }
        }
        return text.map(::shiftChar).joinToString("")
    }
    val text = "Hello, World!"
    val shift = 3
    val encrypted = caesarCipher(text, shift)
    println("зашифровано: $encrypted")
    val decrypted = caesarCipher(encrypted, -shift)
    println("расшифровано: $decrypted")

    println("\n№4")
    fun fizzBuzz(n: Int): List<Any> {
        return (1..n).map { number ->
            when {
                number % 3 == 0 && number % 5 == 0 -> "ВизллБизлл"
                number % 3 == 0 -> "Физллл"
                number % 5 == 0 -> "Бизлллл"
                else -> number
            }
        }
    }
    println(fizzBuzz(5))
    println(fizzBuzz(16))
}
