package po_kotliny
import kotlin.math.sqrt

fun main() {
    var i = 1
    print("Введите двухзначное число: ")
while(i==1){
    val num = readLine()!!.toInt()
    if(num == 0) {
        i = 0
    }else if (num <= 99) {
        val digit1 = num % 10
        val digit2 = (num / 10) % 10
        print("№1\n$num\nа) D=$digit2\nб) E=$digit1\nв) сумма = ${digit2 + digit1}\nг) произведение = ${digit2 * digit1}\n\nВведите число: ")
    } else if (num <= 999) {
        val digit1 = num % 10
        val digit2 = (num / 10) % 10
        val digit3 = (num / 100) % 10
        print("№2\n$num\nа) E=$digit1\nб) D=$digit2\nв) сумма = ${digit3 + digit2 + digit1}\nг) произведение = ${digit3 * digit2 * digit1}\nЧтобы выйти из цыкла введите число 0\n\nВведите число: ")
    } else {
        val digit1 = num % 10
        val digit2 = (num / 10) % 10
        val digit3 = (num / 100) % 10
        val digit4 = (num / 1000) % 10
        print("$num\nT=$digit4 S=$digit3 D=$digit2 E=$digit1\n\nВведите число: ")
    }
}
    print("Цыкл остоновлен\nВведите первое число: ")
    val a = readLine()!!.toDouble()
    print("Введите второе число: ")
    val b = readLine()!!.toDouble()
    val vto = a * a
    val tre = b * b
    val kor = sqrt(a)
    val kar = sqrt(b)
    val c = a/b
    print("№3\n$a / $b = $c\n№4\n$a^2 = $vto\n$b^2 = $tre\n№5\n√$a = $kor\n√$b = $kar")
}