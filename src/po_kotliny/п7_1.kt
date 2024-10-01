package po_kotliny

import kotlin.random.Random

fun main(){
    //1
    print("№1\nВведите первое число: ")
    val one = readLine()!!.toDouble()
    print("Введите второе число: ")
    val two = readLine()!!.toDouble()
    print("\nВыберите номер операции:\n1 - Разделить\n2 - Умножить\n3 - Отнять\n4 - Прибавить\nВаш выбор: ")
    val ope = readLine()!!.toInt()
    when(ope){
        1 -> if(two == 0.toDouble()) {
            print("\nНа 0 делить нельзя!")
        }else{
            print("\n$one : $two = ${one / two}\nPезультат: ${one / two}")
        }
        2 ->print("\n$one * $two = ${one * two}\nPезультат: ${one * two}")
        3 ->print("\n$one - $two = ${one - two}\nPезультат: ${one - two}")
        4 ->print("\n$one + $two = ${one + two}\nPезультат: ${one + two}")
    }

    //2
    print("\n\n№2\n")
    print("Напишите три разных слова (с маленькой буквы и после каждого слова нажимайте Enter):\n")
    val arr28 = arrayOf(readLine()!!.toString(),readLine()!!.toString(),readLine()!!.toString())
    var count = 0
    for (y in arr28) {
        if (y == y.reversed()) {
            print("$y ")
            ++count
        }
    }
    if (count == 0) {
        print("ни одно слово не является палиндромом")
    }else if (count > 1) {
        print("- являются палиндромами")
    } else{
        print("- является палиндромом")
    }

    //3
    print("\n\n№3.1\n")
    print("Напишите сколько раз ваша команда победила: ")
    val pob = readLine()!!.toInt()
    print("сколько раз ваша команда забрала ничью: ")
    val nec = readLine()!!.toInt()
    print("сколько раз ваша команда проиграла: ")
    val por = readLine()!!.toInt()
    val och = (pob * 3) + nec + (por * 0)
    if (och == 1){
        print("Ваша команда заработала $och очко\n")
    }else if ((och >= 2) and (och <= 4)){
        print("Ваша команда заработала $och очка\n")
    }else{
        print("Ваша команда заработала $och очков\n")
    }

    print("\n№3.2\n")
    val arr15 = Array(5) { Random.nextInt(1,100) }
    var min = 1000
    print("arr[")
    for (t in arr15){
        print(" $t")
        if (t <= min) min = t
    }
    println(" ]\nmin = $min")

    print("\n\n№3.3\n")
    print("Введите первое число: ")
    val per = readLine()!!.toDouble()
    print("Введите второе число: ")
    val vto = readLine()!!.toDouble()
    val c :Boolean = per==vto
    print("$c\n\n№4 в п7_2.kt")
    print("\nесли 7_2.kt нет то значит я его доделываю, если вы проверяете при нашей группе можете подойти ко мне я покажу на каком этапе задание №4")
}

