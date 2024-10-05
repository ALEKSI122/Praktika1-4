package po_kotliny

import kotlin.random.Random
import kotlin.math.*
import javax.script.ScriptEngineManager

fun sum(list: List<Int>): Int {
    return list.sum()
}

fun main() {
    val arr = listOf(1, 2, 3, 4, 5)
    val summ = sum(arr)
    println("№1\nСумма: $summ")
    main5()
}

fun MaxiMin(list: List<Int>): Any {
    if (list.isNotEmpty()) {
        var max = 0
        var min = Int.MAX_VALUE
        for(i in list) {
            if(max < i) max = i
            if(min > i) min = i
        }
        return max - min
    } else {
        return 0
    }
}

fun main5() {
    val arr = listOf(1, 2, 3, 4, 5)
    val ra = MaxiMin(arr)
    println("\n№2\nРазноть: $ra")
    main6()
}

fun obs(list1: List<Int>, list2: List<Int>): List<Int> {
    return list1 + list2
}

fun main6() {
    val arr3 = listOf(1, 2, 3)
    val arr4 = listOf(4, 5, 6)

    val ob = obs(arr3, arr4)
    println("\n№3\nОбединённые: $ob\n")
    main7()
}

fun pr(prob: Double, prize: Double, pay: Double): Boolean {
    return (prob * prize) > pay
}

fun main7() {
    println("\n№4\nвведите три числа(через Enter):")
    val prob = readLine()!!.toDouble()
    val prize = readLine()!!.toDouble()
    val pay = readLine()!!.toDouble()
    println("${pr(prob, prize, pay)}\n\n№5\n${pr(prob, prize, pay)}\n")
    main8()
}

fun pr1(prob: Double, prize: Double): Boolean {
    return (prob + prize) < 100
}

fun main8() {
    println("\n№6\nвведите два числа(через Enter):")
    val prob = readLine()!!.toDouble()
    val prize = readLine()!!.toDouble()
    println("${pr1(prob, prize)}\n")
    main9()
}

fun pr2(prob: Double): Boolean {
    val a = prob % 100
    return if (a == 0.toDouble()) true else false
}

fun main9() {
    println("\n№7\nвведите число:")
    val prob = readLine()!!.toDouble()
    println("${pr2(prob)}")
    main10()
}

fun fr(minutes: Int, fps: Int): Int {
    val seconds = minutes * 60
    return seconds * fps
}

fun main10() {
    val minutes = 5
    val fps = 30
    println("\n№8\n${fr(minutes, fps)}\n")
    main11()
}

fun step(n: Double, k: Int): Boolean {
    return k.toDouble().pow(k) == n
}

fun main11() {
    println("\n№9\nвведите два числа(через Enter):")
    val n = readLine()!!.toDouble()
    val k = readLine()!!.toInt()
    println("${step(n, k)}")
    main12()
}

fun rep(txt: String, n: Int): String {
    return if (n <= 0) {
        ""
    } else {
        txt + rep(txt, n - 1)
    }
}

fun main12() {
    print("\n№10\nВведите строку: ")
    val txt = readLine()!!.toString()
    print("Введите сколько раз повторить эту строку: ")
    val n = readLine()!!.toInt()
    println("${rep(txt, n)}")
    main13()
}

fun equation(equation: String): Any {
    val engine = ScriptEngineManager().getEngineByName("JavaScript")
    return engine.eval(equation)
}

fun main13() {
    println("\n№11\n1+1 -> ${equation("1+1")}")
    println("7*4-2 -> ${equation("7*4-2")}")
    println("10/2+5*3 -> ${equation("10/2+5*3")}\n\nнашёл в интернете про javaScript и ScriptEngineManager")
    main14()
}

fun google(number: Int): String {
    val oLetters = "o".repeat(number)
    return "G${oLetters}gle"
}

fun main14() {
    println("\n№12\nnвведите число:")
    val o = readLine()!!.toInt()
    println("${google(o)}")
    main15()
}

fun hi() {
    println("\n№13\nПривет, мир!")
}

fun main15() {
    hi()
    println("\n№14\nвведите два числа(через Enter):")
    val n = readLine()!!.toInt()
    val k = readLine()!!.toInt()
    val sum = fun(a: Int, b: Int): Int = a + b
    println("${sum(n, k)}")
    val raz = fun(a: Int, b: Int): Int = if (a > b) a else b
    println("\n№15\n${raz(n, k)}")
    val ch = fun(number: Int): Boolean = number % 2 == 0
    println("\n№16\n$n Чётное? ${ch(n)}\n$k Чётное? ${ch(k)}")
    main16()
}

fun factorial(n: Int): Long {
    if (n < 0) print("no")
    return if (n == 0) 1 else n * factorial(n - 1)
}

fun main16(){
    println("\n№17\nвведите число:")
    val number = readLine()!!.toInt()
    val result = factorial(number)
    println("Факториал числа $number = $result")
    main17()
}

fun isPrime(n: Int): Boolean {
    if (n <= 1) return false
    if (n == 2) return true
    if (n % 2 == 0) return false
    for (i in 3..Math.sqrt(n.toDouble()).toInt() step 2) {
        if (n % i == 0) return false
    }
    return true
}

fun main17() {
    println("\n№18\nвведите число:")
    val number = readLine()!!.toInt()
    val result = isPrime(number)
    if (result) {
        println("Число $number является простым.")
    } else {
        println("Число $number не является простым.")
    }
    val sum = fun (list: List<Int>): Int = list.sum()
    val arr1 = listOf(1, 2, 3, 4, 5)
    val summ = sum(arr1)
    println("\n№19\nСумма: $summ")
    main18()
}

fun Max(list: List<Int>): Any {
    if (list.isNotEmpty()) {
        var max = 0
        var min = Int.MAX_VALUE
        for(i in list) {
            if(max < i) max = i
            if(min > i) min = i
        }
        return max
    } else {
        return 0
    }
}

fun main18() {
    val arr = listOf(1, 2, 3, 4, 5)
    val ra = Max(arr)
    println("\n№20\nmax: $ra")
    fun sortArray(numbers: IntArray): IntArray {
        return numbers.sortedArray()
    }
    val numbers = intArrayOf(5, 3, 8, 1, 2)
    val sortedNumbers = sortArray(numbers)
    println("\n№21\nОтсортированный массив: ${sortedNumbers.joinToString(", ")}")
    fun isPalindrome(str: String): Boolean {
        val sanitizedStr = str.replace("\\s+".toRegex(), "").toLowerCase()
        val reversedStr = sanitizedStr.reversed()
        return sanitizedStr == reversedStr
    }
    val input = "А роза упала на лапу Азора "
    val result = isPalindrome(input)
    println("\n№22\nвведите строку палиндром:")
    val input2 = readLine()!!.toString()
    val result2 = isPalindrome(input2)
    println("Является ли строка \"$input\" палиндромом? $result\nЯвляется ли строка \"$input2\" палиндромом? $result2")
    fun countCharacters(str: String): Int {
        return str.length
    }
    val characterCount = countCharacters(input)
    val characterCount2 = countCharacters(input2)
    println("\n№23\nКоличество символов в строке \"$input\": $characterCount\nКоличество символов в строке \"$input2\": $characterCount2")
    fun toUpperCase(str: String): String {
        return str.toUpperCase()
    }
    val uppercasedString = toUpperCase(input)
    val uppercasedString2 = toUpperCase(input2)
    println("\n№24\nСтрока в верхнем регистре: $uppercasedString\nСтрока в верхнем регистре: $uppercasedString2")
    fun concatenateStrings(str1: String, str2: String): String {
        return str1 + str2
    }
    val concatenatedString = concatenateStrings(input,input2)
    println("\n№25\nОбъединённая строка: $concatenatedString")
    fun pos(arr: Array<Int>): Int? {
        return if (arr.isNotEmpty()) arr[arr.size - 1] else null
    }
    val arr2 = arrayOf(1, 2, 3, 4, 5)
    val rez = pos(arr2)
    println("\n№26\nПоследний элемент массива: $rez")
    fun ark(array: Array<Int>, element: Int): Boolean {
        return array.contains(element)
    }
    println("\n№27\nвведите число:")
    val elementToCheck = readLine()!!.toInt()
    val isPresent = ark(arr2, elementToCheck)
    if (isPresent) {
        println("Элемент $elementToCheck присутствует в массиве.")
    } else {
        println("Элемент $elementToCheck отсутствует в массиве.")
    }
    fun createArray(n: Int): Array<Int> {
        return Array(n) { it + 1 }
    }
    println("\n№28\nвведите длину массива:")
    val n = readLine()!!.toInt()
    val array = createArray(n)
    array.forEach { print("$it ") }
    main19()
}

fun MaxMin(array: IntArray): Pair<Int, Int>? {
    if (array.isEmpty()) return null
        var max = 0
        var min = Int.MAX_VALUE
        for(i in array) {
            if(max < i) max = i
            if(min > i) min = i
        }
        return Pair(min, max)
}

fun main19() {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    val (min, max) = MaxMin(arr) ?: return println("Массив пустой")
    println("\n\n№29\nmax: $max\nmin: $min")
    fun sumOfNumbers(n: Int): Int {
        if (n < 1) return 0
        return n * (n + 1) / 2
    }
    println("\n№30\nвведите длину массива:")
    val n = readLine()!!.toInt()
    val sum = sumOfNumbers(n)
    println("Сумма всех чисел от 1 до $n: $sum")
    fun celsiusToFahrenheit(celsius: Double): Double {
        return celsius * 9 / 5 + 32
    }
    println("\n№31\nвведите температуру по цельсию:")
    val celsius = readLine()!!.toDouble()
    val fahrenheit = celsiusToFahrenheit(celsius)
    println("$celsius°C равно $fahrenheit°F")
    fun reverseString(input: String): String {
        return input.reversed()
    }
    val originalString = "Hello, World!"
    val reversedString = reverseString(originalString)
    println("\n№32\nОригинальная строка: $originalString")
    println("Строка в обратном порядке: $reversedString")
    fun <T> getElementAtIndex(array: Array<T>, index: Int): T? {
        return if (index in array.indices) {
            array[index]
        } else {
            null
        }
    }
    val numbers = arrayOf(1, 2, 3, 4, 5)
    println("\n№33\nвведите index:")
    val index = readLine()!!.toInt()
    val element = getElementAtIndex(numbers, index)
    if (element != null) {
        println("Элемент на индексе $index: $element")
    } else {
        println("Индекс $index находится вне границ массива")
    }
    fun removeSpaces(input: String): String {
        return input.replace(" ", "")
    }
    val origiString = "Это пример строки с пробелами."
    val stringWithoutSpaces = removeSpaces(origiString)
    println("\n№34\n$stringWithoutSpaces")
    fun sumOfNaturalNumbers(n: Int): Int {
        if (n < 1) {
            throw IllegalArgumentException("N должно быть натуральным числом (больше 0)")
        }
        return n * (n + 1) / 2
    }
    val n2 = 10
    val sum2 = sumOfNaturalNumbers(n2)
    println("\n№35\nСумма первых $n2 натуральных чисел равна $sum2")
    fun containsSubstring(mainString: String, substring: String): Boolean {
        return mainString.contains(substring)
    }
    val mainString = "Привет, мир!"
    val substring = "мир"
    val result = containsSubstring(mainString, substring)
    if (result) {
        println("\n№36\nСтрока \"$substring\" содержится в строке \"$mainString\".")
    } else {
        println("\n№36\nСтрока \"$substring\" не содержится в строке \"$mainString\".")
    }
    fun printMultiplicationTable(number: Int) {
        println("Таблица умножения для числа $number:")
        for (i in 1..10) {
            val result2 = number * i
            println("$number x $i = $result2")
        }
    }
    println("\n№37\nвведите число:")
    val number = readLine()!!.toInt()
    printMultiplicationTable(number)
    fun getStringLength(input: String): Int {
        return input.length
    }
    val exampleString = "Привет, мир!"
    val length = getStringLength(exampleString)
    println("\n№38\nДлина строки \"$exampleString\" составляет $length символов.")
    fun reverseArray(input: IntArray): IntArray {
        val reversedArray = IntArray(input.size)
        for (i in input.indices) {
            reversedArray[i] = input[input.size - 1 - i]
        }
        return reversedArray
    }
    val originalArray = intArrayOf(1, 2, 3, 4, 5)
    val reversedArray = reverseArray(originalArray)
    println("\n№39\nИсходный массив: ${originalArray.joinToString(", ")}")
    println("Перевернутый массив: ${reversedArray.joinToString(", ")}")
    fun copyArray(input: IntArray): IntArray {
        val copiedArray = IntArray(input.size)
        for (i in input.indices) {
            copiedArray[i] = input[i]
        }
        return copiedArray
    }
    val copiedArray = copyArray(originalArray)
    println("\n№40\nИсходный массив: ${originalArray.joinToString(", ")}")
    println("Скопированный массив: ${copiedArray.joinToString(", ")}")
    fun countVowels(input: String): Int {
        val vowels = "aeiouAEIOU"
        var count = 0

        for (char in input) {
            if (char in vowels) {
                count++
            }
        }

        return count
    }
    val inputString = "Привет, как дела?"
    val vowelCount = countVowels(inputString)
    println("\n№41\nКоличество гласных в строке: $vowelCount")
    main20()
}

fun findFirstOccurrence(array: IntArray, target: Int): Int {
    for (index in array.indices) {
        if (array[index] == target) {
            return index
        }
    }
    return -1
}

fun main20() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 3, 7)
    val target = 3

    val index = findFirstOccurrence(numbers, target)

    if (index != -1) {
        println("\n№42\nПервое вхождение элемента $target находится по индексу: $index")
    } else {
        println("\n№42\nЭлемент $target не найден в массиве.")
    }
}