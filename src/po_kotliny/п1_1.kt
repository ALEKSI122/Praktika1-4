package po_kotliny

fun main() {
    println("№1\nцелочислинные типы:\n Byte, Short, int, Long\nвещественные:\n Float, Double\nлогичиские:\n Boolean\nсимволические:\n Char\nстроки:\n String")
    val a = 0.001
    val b = 2.72
    println("\n№2\n $a\n\n№3\n $b")

    print("\n№4\n Введите число: ")
    val name = readLine()!!.toInt()
    println(" Ваше число: $name\n\n№5\n $name - Ваше число")

    var c = 1; var d = 13; var e = 49
    println("\n№6\n $c $d $e")
    c = 7; d = 15; e = 100
    println("\n№7\n $c  $d  $e")
    c = 1465; d = 56; e = 1041
    println("\n№8\n $c  $d  $e")
    c = 185; d = 566; e = 41; val f =5
    println("\n№9\n $c $d $e $f")
    println("\n№10\n 50\n 10")
    println("\n№11\n 5\n 10\n 21")
    println("\n№12\n 1\n 2\n 3\n 4")
}
