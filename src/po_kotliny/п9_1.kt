package po_kotliny

import kotlin.random.Random

fun main() {
    print("№1\n")
    val arr1 = Array(10, { Random.nextInt(1, 100) })
    for (i in arr1) print("$i ")
    println("\n\n№2\nведите строку(на английском языке):")
    val input = readLine() ?: ""

    val vowels = "aeiouAEIOU"
    var vowelCount = 0
    var consonantCount = 0

    for (char in input) {
        when {
            char.isLetter() -> {
                if (char in vowels) {
                    vowelCount++
                } else {
                    consonantCount++
                }
            }
        }
    }
    println("Количество гласных букв: $vowelCount")
    println("Количество согласных букв: $consonantCount")
    val exchangeRates = mapOf(
        "USD" to 0.85, // 1 доллар = 0.85 евро
        "EUR" to 1.18  // 1 евро = 1.18 долларов
    )

    println("\n№3\nВведите сумму для конвертации:")
    val amount = readLine()?.toDoubleOrNull()

    if (amount == null) {
        println("Некорректный ввод суммы.")
        return
    }

    println("Выберите валюту для конвертации (USD или EUR):")
    val fromCurrency = readLine()?.toUpperCase()

    if (fromCurrency !in exchangeRates.keys) {
        println("Некорректная валюта.")
        return
    }

    println("Введите валюту, в которую хотите конвертировать (USD или EUR):")
    val toCurrency = readLine()?.toUpperCase()

    if (toCurrency !in exchangeRates.keys || toCurrency == fromCurrency) {
        println("Некорректная валюта или выбрана та же валюта.")
        return
    }

    // Конвертация
    val conversionRate = exchangeRates[toCurrency]!! / exchangeRates[fromCurrency]!!
    val convertedAmount = amount * conversionRate

    println("$amount $fromCurrency = ${"%.2f".format(convertedAmount)} $toCurrency")
    main21()
}

fun a(str1: String, str2: String): Boolean {
    // Убираем пробелы и приводим строки к нижнему регистру
    val cleanedStr1 = str1.replace(" ", "").toLowerCase()
    val cleanedStr2 = str2.replace(" ", "").toLowerCase()

    // Сравниваем отсортированные символы строк
    return cleanedStr1.toCharArray().sorted() == cleanedStr2.toCharArray().sorted()
}

fun main21() {
    val str1 = "listen"
    val str2 = "silent"
    if (a(str1, str2)) {
        println("\n№4\n\"$str1\" и \"$str2\" являются анаграммами.")
    } else {
        println("\n№4\n\"$str1\" и \"$str2\" не являются анаграммами.")
    }
    main22()
}

fun issPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}

fun findPrimesUpToN(n: Int): List<Int> {
    return (2..n).filter { issPrime(it) }
}

fun main22() {
    println("\n№5\nВведите число N:")
    val input = readLine()?.toIntOrNull()

    if (input != null && input > 0) {
        val primes = findPrimesUpToN(input)
        println("Простые числа до $input: $primes")
    } else {
        println("Пожалуйста, введите корректное положительное число.")
    }
    fun sortStringsAlphabetically(strings: Array<String>): Array<String> {
        return strings.sortedArray()
    }
    val strings = arrayOf("banana", "apple", "orange", "grape", "kiwi")
    val sortedStrings = sortStringsAlphabetically(strings)
    println("\n№6\nОтсортированные строки: ${sortedStrings.joinToString(", ")}")

    fun toggleCase(input: String): String {
        return input.map {
            if (it.isUpperCase()) it.toLowerCase() else it.toUpperCase()
        }.joinToString("")
    }
    println("\n№7\nВведите строку:")
    val input2 = readLine() ?: ""
    val toggledCase = toggleCase(input2)
    println("Строка с изменённым регистром: $toggledCase")

    val a = IntArray(1){Random.nextInt(100)}
    for (i in a){
        println("\n№8\nДобро пожаловать в игру \"Угадай число\"\n(это угадай число которое я делал на Java, я переделал его на Kotlin).")
        println("Играют два игрока.")
        println("Нужно вводить число в интревале от 1 до 100, кто первый угадал тот и выиграл. ")
        while (true) {
            println("Первый игрок введите число : ")
            val one = readLine()!!.toInt()
            println("Второй игрок введите число : ")
            val two = readLine()!!.toInt()
            if (one == i) {
                println("Поздравляем!!! Победил первый игрок!!! Это было число  - $i")
                break
            } else if (two == i) {
                println("Поздравляем!!! Победил второй игрок!!! Это было число  - $i")
                break
            } else {
                println("Пока никто не угадал :(  Попробуйте еще.")
                println("\nПодсказка : ")
                if (one < i) {
                    println("Число первого игрока меньше искомого")
                }
                if (one > i) {
                    println("Число первого игрока больше искомого")
                }

                if (two < i) {
                    println("Число второго игрока меньше искомого\n")
                }

                if (two > i) {
                    println("Число второго игрока больше искомого\n")
                }
            }
        }
    }
    fun generateRandomPassword(length: Int): String {
        val lowercaseLetters = ('a'..'z').toList()
        val uppercaseLetters = ('A'..'Z').toList()
        val digits = ('0'..'9').toList()
        val specialCharacters = listOf('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+')
        val allCharacters = lowercaseLetters + uppercaseLetters + digits + specialCharacters
        return (1..length)
            .map { allCharacters.random() }
            .joinToString("")
    }
    println("\n№9\nВведите желаемую длину пароля:")
    val input4 = readLine()
    val length = input4?.toIntOrNull()
    if (length != null && length > 0) {
        val password = generateRandomPassword(length)
        println("Сгенерированный пароль: $password")
    } else {
        println("Пожалуйста, введите положительное целое число.")
    }
    fun findLongestWord(input: String): Pair<String, Int> {
        val words = input.split(Regex("\\W+")).filter { it.isNotEmpty() }
        var longestWord = ""
        var maxLength = 0
        for (word in words) {
            if (word.length > maxLength) {
                longestWord = word
                maxLength = word.length
            }
        }

        return Pair(longestWord, maxLength)
    }
    println("\n№10\nВведите строку(на английском языке):")
    val input3 = readLine() ?: ""
    if (input3.isNotBlank()) {
        val (longestWord, length) = findLongestWord(input3)
        if (longestWord.isNotEmpty()) {
            println("Самое длинное слово: '$longestWord' (длина: $length)")
        } else {
            println("Нет слов в строке.")
        }
    } else {
        println("Строка не может быть пустой.")
    }
}