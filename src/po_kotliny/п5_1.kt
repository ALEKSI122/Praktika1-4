package po_kotliny
import kotlin.random.Random


fun IntArray.bubbleSort() {
    var sorted = false
    while (!sorted) {
        sorted = true
        for (i in 1 until this.size) {
            val previous = this[i - 1]
            val current = this[i]
            if (previous > current) {
                this.swap(i - 1, i)
                sorted = false
            }
        }
    }
}

fun IntArray.swap(index1: Int, index2: Int) {
    val buffer = this[index1]
    this[index1] = this[index2]
    this[index2] = buffer
}

fun main() {
    print("№1\n")
    for(i in 1..10){
        print("$i ")
    }

    print("\n\n№2\n")
    for(i in 1..20){
        val a = i %2
        if(a!=0)continue
        print("$i ")
    }

    print("\n\n№3\nВведите число: ")
    val b = readLine()!!.toInt()
    var f = 0
    var i = 1
    while (i <=b){
        f += i
        i++
    }

    print("сумма=$f\n\n№4\n")
    val fa = readLine()!!.toInt()
    var it = 1
    for (ii in 1..fa){
        it *= ii
        if (ii == fa){
            print("Факториал $fa = $it\n\n№5\n")
        }
    }

    val pr = readLine()!!.toInt()
    var del : Int
    var re = 0
    if (pr <= 0){
        print("число должно быть положительным!")
    }else{
        for (ip in 2..pr){
            del = pr % ip
            if ((ip != pr) and (del == 0)){
                print("число $pr не является простым\n\n№6\n")
                break
            }else{
                re = 1
            }
        }
        if (re == 1) {
            print("число $pr является простым\n\n№6\n")
        }
    }

    var tv : Int
    for(t1 in 1..10){
        for(t2 in 1..10){
            tv = t1 * t2
            if (t2 == 10){
                print("$tv\n")
            }else{
                print("$tv\t")
            }
        }
    }

    var n = 1
    while (n != 0) {
        print("\n№7\n")
        n = readLine()!!.toInt()
        var fibonacci = 0
        var prev = 1
        for (io in 2..n) {
            fibonacci += prev
            prev = fibonacci - prev
        }
        print("$fibonacci\n")
    }

    print("\n№8\n")
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()
    while (num2 != 0) {
        val temp = num2
        num2 = num1 % num2
        num1 = temp
    }
    print("НОД = $num1,$num2\n\n№9\nнапишите что-нибудь: ")

    val st = readLine()!!.toString()
    val ts = st.reversed()
    print("в обратном порядке: $ts\n\n№10\nВведите число до 9999: ")
    val num = readLine()!!.toInt()
    val digit1 = num % 10
    val digit2 = (num / 10) % 10
    val digit3 = (num / 100) % 10
    val digit4 = (num / 1000) % 10
    print("сумма = ${digit4+digit3+digit2+digit1}\n\n№11\nнапишите что-нибудь:")
    main2()
}
fun areAnagrams(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) {
        return false
    }
    val charCount = IntArray(26)
    for (i in str1.indices) {
        charCount[str1[i] - 'a']++
        charCount[str2[i] - 'a']--
    }
    for (count in charCount) {
        if (count != 0) {
            return false
        }
    }
    return true
}

fun main2() {
    val str1 = readLine()!!.toString()
    print("напишите что-нибудь ещё: ")
    val str2 = readLine()!!.toString()
    val areAnagrams = areAnagrams(str1, str2)
    if (areAnagrams) {
        println("$str1 и $str2 являются аргументом.")
    } else {
        println("$str1 и $str2 не является аргументом.")
    }

    print("\n\n№12\n")
    println("Последовательность")
    print("Начало >> ")
    val start = readLine()?.toInt() ?: 0
    print("Шаг >> ")
    val step = readLine()?.toInt() ?: 0
    print("Размер >> ")
    val size20 = readLine()?.toInt() ?: 0

    val arr20 = Array(size20) {start + it * step}
    for(i in arr20) print("$i "); println()

    print("\n\n№13\n")
    for (i in 1..20){
        println("$i^2=${i*i}")
    }

    print("\n№14\n")
    val arr1 = Array(10, {Random.nextInt(1, 100)})
    for(i in arr1) print("$i ")

    print("\n\n№15\n")
    print("напишите что-нибудь: ")
    val str = readLine()!!.toString()
    if (str == str.reversed()) {
        print("$str является полидромом.")
    } else {
        print("$str не является полидромом.")
    }

    print("\n\n№16\n")
    print("Введите число n : ")
    val n = readLine()!!.toInt()
    var sum = 0
    for (i in 1..n) {
        sum += i * i
    }
    print("Сумма квадратов от 1 до $n = $sum")

    print("\n\n№17\nнапишите что-нибудь: ")
    val s = readLine()!!.toString()
    for (i in s) {
        print("$i ")
    }

    print("\n\n№18\n")
    val g = readLine()!!.toInt()
    for (i in 1..g){
        for (j in 1..i){
            print("#")
        }
        print("\n")
    }

    print("\n\n№19\n")
        val array = intArrayOf(10, 12, 16, 17, 19, 13, 11, 18, 14)
        println(array.toList())
        array.bubbleSort()
        println(array.toList())

    print("\n\n№20\n")
    print("Введите начало диапозона: ")
    val na = readLine()!!.toInt()
    print("Введите конец диапозона: ")
    val ko = readLine()!!.toInt()
    var de : Int
    var rep =0
    for (pi in na..ko) {
        for (ip in 2..pi) {
            de = pi % ip
            if ((ip != pi) and (de == 0)){
                rep = 0
                break
            }else{
                rep = 1
            }
        }
        if ((rep == 1) or (pi == 1)) {
            print("$pi ")
        }
    }

    print("\n\n№21\n")
    print("Введите любой год: ")
    val god = readLine()!!.toInt()
    print("Введите любой месяц(от 1 до 12): ")
    val mes = readLine()!!.toInt()
    val d4 = god % 4
    val d100 = god % 100
    val d400 = god % 400
    var day = 30
    var tik = 0
    when(mes){
        1->day=31
        3->day=31
        4->day=30
        5->day=31
        6->day=30
        7->day=31
        8->day=31
        9->day=30
        10->day=31
        11->day=30
        12->day=31
    }
    if (mes==2) {
        if ((d4 == 0) and (d100 != 0) or (d400 == 0)) {
            for (i in 1..29){
                tik += 1
                if(tik == 8){
                    print("$i\n")
                    tik = 0
                }else{
                    print("$i\t")
                }
            }
        } else {
            for (i in 1..28){
                tik += 1
                if(tik == 8){
                    print("$i\n")
                    tik = 0
                }else{
                    print("$i\t")
                }
            }
        }
    }else {
        for (i in 1..day) {
            tik += 1
            if (tik == 8) {
                print("$i\n")
                tik = 0
            } else {
                print("$i\t")
            }
        }
    }

    print("\n\n№22\n")
    val a = IntArray(1){Random.nextInt(100)}
    for (i in a){
    println("Добро пожаловать в игру \"Угадай число\"\n(это угадай число которое я делал на Java, я переделал его на Kotlin).")
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

    print("\n\n№23\n")
    var ct = 1
    while (ct > 0) {
        val aa = IntArray(1) { Random.nextInt(10) }
        println("Введите первое число : ")
        val per = readLine()!!.toInt()
        println("Введите второе число : ")
        val vto = readLine()!!.toInt()
        for (i in aa) {
            if (i <= 5) {
                println("$per + $vto = ${per + vto}")
            } else {
                println("$per * $vto = ${per * vto}")
            }
        }
        print("Введите 'стоп' чтобы остановить: ")
        val st = readLine()!!.toString()
        if (st == "стоп") {
            ct = 0
        }
    }

    print("\n\n№24\n")
    main3()
}
fun transposeMatrix(matrix: Array<Array<Int>>): Array<Array<Int>> {
    val rows = matrix.size
    val columns = matrix[0].size
    val transposedMatrix = Array(columns) { Array(rows) { 0 } }
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            transposedMatrix[j][i] = matrix[i][j]
        }
    }
    return transposedMatrix
}

fun main3() {
    val originalMatrix = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )
    val transposedMatrix = transposeMatrix(originalMatrix)
    println("Начальная матрица:")
    for (row in originalMatrix) {
        println(row.contentToString())
    }
    println("Транспонированная матрица:")
    for (row in transposedMatrix) {
        println(row.contentToString())
    }

    print("\n\n№25\n")
    for (i in 1..10){
        println("$i^3=${i*i*i}")
    }

    print("\n\n№26\n")
    print("Введите число : ")
    val pir = readLine()!!.toInt()
    var chet =0
    var nechet = 0
    for (u in 1..pir){
        val delo = u % 2
        if(delo == 0){
            chet += u
        }else{
            nechet+=u
        }
    }
    println("сумма чётных = $chet\nсумма нечётных = $nechet")

    print("\n\n№27\nВведите число: ")
    val rows = readLine()!!.toInt()
    var k = 0
    var count = 0
    var count1 = 0
    for (i in 1..rows) {
        for (space in 1..rows - i) {
            print("  ")
        }
        ++count
        while (k != 2 * i - 1) {
            if (count <= rows - 1) {
                print((i + k).toString() + " ")
                ++count
            } else {
                ++count1
                print((i + k - 2 * count1).toString() + " ")
            }
            ++k
        }
        k = 0
        count = 0
        count1 = 0
        println()
    }

    print("\n\n№28\nВведите число: ")
    val six = readLine()!!.toInt()
    val array = IntArray(six) { Random.nextInt(100) }
    println(array.toList())
    array.bubbleSort()
    println(array.toList())

    print("\n\n№29\nВведите число: ")
    val aff = readLine()!!.toInt()
    var result= 0.0
    for (i in 1..aff) {
        result += 1.0 / i
    }
    print(result)

    print("\n\n№30\nВведите число: ")
    main4()
}
fun toBinary(n: Int): String {
    return if (n != 0) toBinary(n / 2) + n % 2 else {""}
}
fun main4() {
    val n = readLine()!!.toInt()
    val binary = toBinary(n)
    println(binary)
}


