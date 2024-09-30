package po_kotliny

import kotlin.random.Random
//21
fun removeElement(arr21: IntArray, element: Int): IntArray{
    return arr21.filter {it != element}.toIntArray()
}

//23
fun concatArrays(vararg arrays: IntArray) : IntArray{
    var result23 = IntArray(0)
    for(i in arrays) result23 += i
    return result23
}


fun main() {
    //1
    print("№1\n")
    val arr1 = Array(5, { Random.nextInt(1, 100)})
    for(i in arr1) print("$i ")

    //2
    print("\n\n№2\n")
    val arr2 = Array(5, { Random.nextInt(1, 100)})
    var sum2 = 0
    for(i in arr2) {
        print("$i ")
        sum2 += i
    }
    println("\nСумма: $sum2")

    //3
    print("\n№3\n")
    val arr3 = Array(10, { Random.nextInt(1, 100)})
    var max = 0
    var min = Int.MAX_VALUE
    for(i in arr3) {
        print("$i ")
        if(max < i) max = i
        if(min > i) min = i
    }
    println("\nМаксимальное: $max\n" +
            "Минимльное: $min")

    //4
    print("\n№4\n")
    val arr4 = Array(10, { Random.nextInt(1, 100)})
    for(i in arr4) {
        print("$i ")
    }
    println()
    arr4.sort()
    for(i in arr4) {
        print("$i ")
    }

    //5
    print("\n\n№5\n")
    val arr5 = Array(10) { Random.nextInt(100) }
    for(i in arr5) {
        print("$i ")
    }
    println()
    for(i in arr5){
        var count = 0
        for(j in arr5){
            if(i == j){
                count++
            }
        }
        if(count == 1) print("$i ")
    }

    //6
    print("\n\n№6\n")
    val arr6 = Array(10) { Random.nextInt(100) }
    for(i in arr6) {
        print("$i ")
    }
    println()
    var even = 0
    var notEven = 0
    val arrE = Array(10) {0}
    val arrNE = Array(10) {0}
    for(i in arr6){
        if(i % 2 == 0) arrE[even++] = i
        if(i % 2 == 1) arrNE[notEven++] = i
    }
    for(i in 0..even) print("${arrE[i]} ")
    println()
    for(i in 0..even) print("${arrNE[i]} ")

    //7
    print("\n\n№7\n")
    val arr7 = Array(10) { Random.nextInt(100) }
    for(i in arr7) print("$i ")
    println()
    arr7.reverse()
    for(i in arr7) print("$i ")

    //8
    print("\n\n№8\n")
    val arr8 = Array(10) { Random.nextInt(100) }
    for(i in arr8) print("$i ")
    print("\nНайти значение >> ")
    val value8 = readLine()?.toInt() ?: 0
    val result = arr8.indexOf(value8)
    if(result == -1) println("$value8 не найдено")
    else println("$value8 под $result индексом")

    //9
    print("\n№9\n")
    val arr9 = Array(10) { Random.nextInt(100) }
    for(i in arr9) print("$i ")
    println()
    val arr92 = arr9.copyOf()
    for(i in arr92) print("$i ")

    //10
    print("\n\n№10\n")
    val arr10 = Array(10) { Random.nextInt(100) }
    for(i in arr10) print("$i ")
    println()
    var sum = 0
    for(i in arr10) if(i % 2 == 0) sum += i
    println("Сумма: $sum")

    //11
    print("\n№11\n")
    val arr11 = List(10) { Random.nextInt(100) }
    val arr112 = List(10) { Random.nextInt(100) }
    for(i in arr11) print("$i ")
    println()
    for(i in arr112) print("$i ")
    println()
    for(i in arr11.intersect(arr112.toSet())) print("$i ")

    //12
    print("\n\n№12\n")
    val arr12 = Array(10) { Random.nextInt(100) }
    for(i in arr12) print("$i ")
    print("\nПервый индекс >> ")
    val a = readLine()?.toInt() ?: 0
    print("\nВторой индекс >> ")
    val b = readLine()?.toInt() ?: 0
    val tmp = arr12[a]
    arr12[a] = arr12[b]
    arr12[b] = tmp
    for(i in arr12) print("$i ")

    //13
    print("\n\n№13\n")
    val arr13 = Array(20) { Random.nextInt(1,101) }
    for(i in arr13) print("$i ")

    //14
    print("\n\n№14\n")
    val arr14 = Array(10) { Random.nextInt(1,101) }
    for(i in arr14) print("$i ")
    println()
    for(i in arr14) if(i % 3 == 0) print("$i ")

    //15
    print("\n\n№15\n")
    val arr15 = Array(5) { Random.nextInt(1,5) }
    for(i in arr15) print("$i ")
    println()
    var isPalindrom = true
    for(i in 0..(arr15.size / 2)){
        if(arr15[i] != arr15[arr15.size - i - 1]){
            isPalindrom = false
            break
        }
    }
    println(if(isPalindrom) "Это палиндром" else "Это не палиндром")

    //16
    print("\n№16\n")
    val arr16 = Array(5, {Random.nextInt(100)})
    for(i in arr16) print("$i "); println()
    val arr162 = Array(5, {Random.nextInt(100)})
    for(i in arr162) print("$i "); println()
    val arr163 = arr16 + arr162
    for(i in arr163) print("$i "); println()

    //17
    print("\n№17\n")
    val arr17 = Array(5, {Random.nextInt(100)})
    for(i in arr17) print("$i "); println()
    println("Сумма: ${arr17.sum()}\nПроизведение: ${arr17.reduce {product, i -> product * i}}")

    //18
    print("\n№18\n")
    val arr18 = IntArray(30) { Random.nextInt(1, 100) }
    arr18.forEachIndexed { index, value ->
        print("$value ")
        if ((index + 1) % 5 == 0) println()
    }

    //19
    print("\n№19\n")
    val arr19 = Array(5, {Random.nextInt(100)})
    arr19.sort()
    for(i in arr19) print("$i "); println()
    val arr192 = Array(5, {Random.nextInt(100)})
    arr192.sort()
    for(i in arr192) print("$i "); println()
    val arr193 = arr19 + arr192
    arr193.sort()
    for(i in arr193) print("$i "); println()

    //20
    print("\n№20\n")
    println("Вывод элементов арифметической прогрессии")
    print("Начало >> ")
    val start = readLine()?.toInt() ?: 0
    print("Шаг >> ")
    val step = readLine()?.toInt() ?: 0
    print("Количество элементов >> ")
    val size20 = readLine()?.toInt() ?: 0

    val arr20 = Array(size20) {start + it * step}
    for(i in arr20) print("$i "); println()


    //21
    print("\n№21\n")
    println("Удаление элемента")
    var arr21 = IntArray(10) {Random.nextInt(100)}
    for(i in arr21) print("$i "); println()
    print("Элемент >> ")
    val element21 = readLine()?.toInt() ?: 0
    arr21 = removeElement(arr21, element21)
    for(i in arr21) print("$i "); println()


    //22
    print("\n№22\n")
    val arr22 = IntArray(10) {Random.nextInt(100)}
    for(i in arr22) print("$i "); println()
    val secondMax = arr22.filter {it != arr22.max()}.max()
    println("Второе по величине число: $secondMax")


    //23
    print("\n№23\n")
    val arr23 = IntArray(4) {Random.nextInt(100)}
    for(i in arr23) print("$i "); println()
    val arr232 = IntArray(4) {Random.nextInt(100)}
    for(i in arr232) print("$i "); println()
    val arr233 = IntArray(4) {Random.nextInt(100)}
    for(i in arr233) print("$i "); println()
    for(i in concatArrays(arr23, arr232, arr233)) print("$i "); println()


    //24
    print("\n№24\n")
    val arr24 = Array(5) {IntArray(5) {Random.nextInt(100)} }
    arr24.forEach { it.forEach { print("$it ") }; println() }
    for(i in 0..3)
        for(j in (1 + i)..4)
            arr24[i][j] = arr24[j][i].also {arr24[j][i] = arr24[i][j]}
    println()
    arr24.forEach { it.forEach { print("$it ") }; println() }

    //25
    print("\n№25\n")
    println("Поиск элемента")
    val arr25 = IntArray(10) {Random.nextInt(100)}
    arr25.forEach {print("$it ")}; println()
    print(">> ")
    val element = readLine()?.toInt() ?: 0
    println(arr25.indexOf(element) != -1)

    //26
    print("\n№26\n")
    val arr26 = IntArray(10) {Random.nextInt(100)}
    arr26.forEach {print("$it ")}; println()
    println("Среднее арифметическое: ${String.format("%.2f", arr26.sum().toDouble() / arr26.size)}")

    //27
    print("\n№27\n")
    val arr27 = IntArray(20) {Random.nextInt(10)}
    arr27.forEach {print("$it ")}; println()
    var prev27 = arr27[0]
    var maxSize = 1
    var curSize = 1
    var value27 = 0
    for(i in 1..(arr27.size-1)){
        if(arr27[i] == prev27) curSize++
        else {
            if(maxSize < curSize) {
                maxSize = curSize
                value27 = prev27
            }
            curSize = 1
        }
        prev27 = arr27[i]
    }
    println(if(maxSize < 2) "Последовательности не найдены" else "Максимальный размер последовательности $maxSize из чисел $value27")

    //28
    print("\n№28\n")
    print("Размер массива >> ")
    val size28 = readLine()?.toInt() ?: 0
    var arr28 = IntArray(size28)
    arr28 = arr28.map {readLine()?.toInt() ?: 0}.toIntArray()
    arr28.forEach {print("$it ")}; println()

    //29
    print("\n\n№29\n")
    val arr29 = IntArray(11) {Random.nextInt(100)}
    arr29.forEach { print("$it ") }; println()
    println("Медиана: ${arr29.sortedArray()[arr29.size / 2]}")

    //30
    print("\n№30\n")
    val arr30 = IntArray(100) {Random.nextInt(100)}
    arr30.forEach { print("$it ") }; println("\n")
    arr30.forEachIndexed {i, value30 ->
        print("%02d ".format(value30))
        if((i + 1) % 10 == 0) println()
    }
}