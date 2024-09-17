package po_kotliny

fun main(){
    print("№1\nВведите 1 число: ")
    val chi1 = readLine()!!.toInt()
    print("Введите 2 число: ")
    val chi2 = readLine()!!.toInt()
    print("Введите 3 число: ")
    val chi3 = readLine()!!.toInt()
    /*if(chi1>chi2){
        if(chi1>chi3){
            print("\nСамое большое число 1: $chi1")
        }else{
            print("\nСамое большое число 3: $chi3")
        }
    }else if(chi2>chi3){
        print("\nСамое большое число 2: $chi2")
    }else{
        print("\nСамое большое число 3: $chi3")
    }*/
    if((chi1>chi2) and (chi1>chi3)){
        println("Самое большое число 1: $chi1")
    }else if((chi2>chi1) and (chi2>chi3)){
        println("Самое большое число 2: $chi2")
    }else{
        println("Самое большое число 3: $chi3")
    }

    println("\n№2")
    if((chi1 == chi2) or (chi1 == chi3) or (chi2 == chi3)){
        println("Ошибка")
    }else if(((chi1 > chi2) and (chi1 < chi3)) or ((chi1 < chi2) and (chi1 > chi3))){
        println("Среднее число 1: $chi1")
    }else if(((chi2 > chi1) and (chi2 < chi3)) or ((chi2 < chi1) and (chi2 > chi3))) {
        println("Среднее число 2: $chi2")
    }else{
        println("Среднее число 3: $chi3")
    }

    print("\n№3\nВведите чётное или нечётное число: ")
    val ch1 = readLine()!!.toInt()
    val ch = ch1 % 2
    if(ch == 0){
        print("Введите нечётное число: ")
        val ch2 = readLine()!!.toInt()
        println("\nнечётное число: $ch2")
    }else{
        print("Введите чётное число: ")
        val ch2 = readLine()!!.toInt()
        println("\nнечётное число: $ch1")
    }

    print("\n№4\nВведите число: ")
    val c1 = readLine()!!.toInt()
    print("Введите число меньше $c1: ")
    val c2 = readLine()!!.toInt()
    val cc = c1 / c2
    val co = c1 % c2
    if(co == 0){
        print("$cc\nчисло $c1 кратно числу $c2")
    }else{
        print("$cc,$co\nчисло $c1 не кратно числу $c2")
    }

    print("\n№5\nВведите сторуну А: ")
    val x = readLine()!!.toInt()
    print("Введите сторуну B: ")
    val y = readLine()!!.toInt()
    print("Введите сторуну C: ")
    val z = readLine()!!.toInt()
    val ab = x + y
    val bc = y + z
    val ca = z + x
    if((x <= bc) and (y <= ca) and (z <= ab)){
        println("Такой треугольник существует")
    }else{
        println("Такого треугольника не существует")
    }

    print("\n№6\nВведите любой год: ")
    val god = readLine()!!.toInt()
    val d4 = god % 4
    val d100 = god % 100
    val d400 = god % 400
    if((d4 == 0) and (d100 != 0) or (d400 == 0)){
        println("$god високосный у него 366 дней")
    }else{
        println("$god не високосный у него 365 дней")
    }

    print("\n№7\nВведите вещественное 1 число: ")
    val chs1= readLine()!!.toFloat()
    print("Введите вещественное 2 число: ")
    val chs2 = readLine()!!.toFloat()
    if(chs1 > chs2){
        println("$chs1 больше $chs2")
    }else{
        println("$chs2 больше $chs1")
    }

    print("\n№8\nВведите километры: ")
    val km= readLine()!!.toFloat()
    print("Введите футы: ")
    val ft = readLine()!!.toFloat()
    val kvm = km * 1000
    val fvm = ft / 3.281
    if (kvm > fvm){
        println("$km больше $ft")
    }else{
        println("$ft больше $km")
    }

    print("\n№9\nВведите 1 число: ")
    val m= readLine()!!.toInt()
    print("Введите 2 число: ")
    val n = readLine()!!.toInt()
    val de = m % n
    if(de == 0){
        println("${m / n}")
    }else{
        println("m на n нацело не делится")
    }

    print("\n№10\nВведите число а: ")
    val a= readLine()!!.toInt()
    print("Введите число б: ")
    val b = readLine()!!.toInt()
    val del = b % a
    if(del == 0){
        println("число а является делителем числа б")
    }else{
        println("число а не является делителем числа б")
    }

    print("\n№11\nВведите число: ")
    val a1= readLine()!!.toInt()
    val de1 = a1 % 2
    val sem = a1 %10
    if(de1 == 0){
        println("a) чётное")
        if(sem == 7){
            println("б) оканчивается на 7")
        }else{
            println("б) не оканчивается на 7")
        }
    }else{
        println("a) нечётное")
        if(sem == 7){
            println("б) оканчивается на 7")
        }else{
            println("б) не оканчивается на 7")
        }
    }

    print("\n№12\nВведите двузначное число: ")
    val a2= readLine()!!.toInt()
    val digi1 = a2 % 10
    val digi2 = (a2 / 10) % 10
    if(digi1==digi2){
        println("первое:$digi2 левое:$digi1 \na) равны \nб) одинаковы")
    }else if(digi1>digi2){
        println("первое:$digi2 левое:$digi1 \na) первая больше \nб) разные")
    }else{
        println("первое:$digi2 левое:$digi1 \na) левая больше \nб) разные")
    }

    print("\n№13\nВведите четырехзначное число: ")
    val num= readLine()!!.toInt()
    val digit1 = num % 10
    val digit2 = (num / 10) % 10
    val digit3 = (num / 100) % 10
    val digit4 = (num / 1000) % 10
    val summ1 = digit4 + digit3
    val summ2 = digit2 + digit1
    val summoll = digit1 + digit2 + digit3 + digit4
    val pro = digit1 * digit2 * digit3 * digit4
    if(summ1==summ2){
        println("а) сумма равна")
    }else {
        println("а) сумма не равна")
    }
    if (summoll % 3 == 0){
        println("б) кратна 3")
    }else {
        println("б) не кратна 3")
    }
    if (pro % 4 == 0){
        print("в) кратна 4\nвведите число: ")
    }else {
        print("в) не кратна 4\nвведите число: ")
    }
    val s = readLine()!!.toInt()
    if (pro % s == 0){
        println("г) кратна $s")
    }else {
        println("г) не кратна $s")
    }
}