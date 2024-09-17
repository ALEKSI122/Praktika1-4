package po_kotliny
/*  print("№1\nа) A или B; б) А и В; в) В или С;" +
            "\nа) ${A or B} б) ${A and B} в) ${B or C};")*/

fun main(){
    val a = true
    val b = false
    val c = false
    println("№1\nа) A или B = ${a or b} \nб) А и В = ${a and b} \nв) В или С = ${b or c}")
    val x = false
    val y = true
    val z = false
    println("№2\nа) X или Z = ${x or z} \nб) X и Y = ${x and y} \nв) X и Z = ${x or z}")
    val a1 = true
    val b1 = false
    val c1 = false
    println("№3\nа) не A и B = ${!a1 and b1} \nб) A или не B = ${a1 or !b1} \nв) A и B или C = ${a1 and b1 or c1}")
    val x1 = true
    val y1 = true
    val z1 = false
    println("№4\nа) не X и Y = ${!x1 and y1} \nб) X или не Y = ${x1 or !y1} \nв) X или Y и Z = ${x1 or y1 and z1}")
    val x2 = true
    val y2 = true
    val z2 = false
    println("№5\nа) не X и Y = ${!x2 and y2} \nб) X или не Y = ${x2 or !y2} \nв) X или Y и Z = ${x2 or y2 and z2}")
    val x3 = false
    val y3 = false
    val z3 = true
    println("№6\nа) X или Y и не Z = ${x3 or y3 and !z3} \nб) не X и не Y = ${!x3 and !y3} \nв) не (X и Z) или Y = ${!(x3 and z3) or y3}\nг) X и не Y или Z = ${x3 and !y3 or z3}\nд) X и (не Y или Z) = ${x3 and (!y3 or z3)}\nе) X или (не(Y или Z)) = ${x3 and (!(y3 or z3))}")
    val a2 = true
    val b2 = false
    val c2 = false
    println("№7\nа) A или не (А и B) или С = ${a2 or !(a2 and b2) or c2} \nб) не А или А и (В или С) = ${!a2 or a2 and (b2 or c2)} \nв) (A или В и не С) и С = ${(a2 or b2 and !c2) and c2}")
}