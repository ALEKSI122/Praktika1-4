package po_kotliny

fun main(){
    print("№1\nВведите номер дня недели: ")
    val a = readLine()!!.toInt()
    when(a){
        1-> println("Понедельник первый день недели")
        2-> println("Вторник второй день недели")
        3-> println("Среда третий день недели")
        4-> println("Четверк четвёртый день недели")
        5-> println("Пятница пятый день недели")
        6-> println("Суббота шестой день недели")
        7-> println("Воскресенье седьмой день недели")
        else-> println("такого дня недели нет")
    }
    print("\n№2\nВведите сторону А: ")
    val x = readLine()!!.toInt()
    print("Введите сторону B: ")
    val y = readLine()!!.toInt()
    print("Введите сторону C: ")
    val z = readLine()!!.toInt()
    when{
        (x==y)and(y==z)-> println("Равносторонний")
        (x==y)or (y==z)or(x==z)-> println("Равнобедренный")
        else-> println("Разносторонний")
    }
    print("\n№3\nВведите любую оценку(от 1 до 5): ")
    val a1 = readLine()!!.toInt()
    when(a1){
        1-> println("ужастно")
        2-> println("Неудовлетворительно")
        3-> println("плохо")
        4-> println("хорошо")
        5-> println("отлично")
        else-> println("Ты что читать не умеешь написано же от 1 до 5")
    }
    print("\n№4\nВведите любое время суток с мальнькой буквы: ")
    val a2 = readLine()!!.toString()
    when(a2){
        "утро"-> println("c 6:00 до 12:00")
        "день"-> println("c 12:00 до 18:00")
        "вечер"-> println("c 18:00 до 0:00")
        "ночь"-> println("c 0:00 до 6:00")
        else-> println("Ты похоже ошибся")
    }
    print("\n№5\nВведите любое число: ")
    val a3 = readLine()!!.toInt()
    when{
        a3==0-> println("Эт ноль")
        a3 < 0 -> println("отрийательное")
        a3 > 0 -> println("положительное")
        else-> println("Чего")
    }
    print("\n№6\nЗагодайте число от 1 до 10: ")
    val a4 = readLine()!!.toInt()
    when(a4){
        1-> println("Хмммм.. дайка подумать... думаю это число 1?")
        2-> println("о монетка на полу лежит. О 2 рубля, а вы случаем не зогодали 2?")
        3-> println("Я календарь перевернул и увидел 3, Вы загодали 3?")
        4-> println("Я родился несколько лет таму назат в четверк... Ой очем это, думаю вызогодали 4?")
        5-> println("Бу-ду в пят-ни-цу о-пять о субботе я мечтать, а да мнеже отгодать нужно,5?")
        6-> println("это 6 потому что логично что не 9")
        7-> println("Воскресенье седьмой день недели")
        8-> println("Котилось безконечность и вдруг застряло, теперь это 8")
        9-> println("это 9 потому что логично что не 6")
        10-> println("10 москвичей... непомную как там дальше, но ты загодал 10")
        else-> println("Ой слишком большое число")
    }
    print("\n№7\nВведите что-то в строку: ")
    val a5 = readLine()!!.toString()
    println("${a5.count()} символов, так на много удобнее просто")

    print("\n№8\nВведите тип пищи: ")
    val a6 = readLine()!!.toString()
    when(a6){
        "мясо"-> println("~40мин")
        "рыба"-> println("~20мин")
        "хлеб"-> println("~45")
        "молоко"-> println("~10")
        "яйца"-> println("~90")
        else-> println("такой тип я не писал")
    }

    print("\n№9\nВведите что-то в строку: ")
    val a7 = readLine()!!.toString()
    println("${a7.count()} символов, так на много удобнее просто")

    print("\n№10\nКак будете оплачивать?: ")
    val a8 = readLine()!!.toString()
    when(a8){
        "наличными"-> println("Выбранна оплата наличными")
        "картой"-> println("Выбранна оплата картой")
        "переводом"-> println("Выбранна оплата переводом")
        "qr"-> println("Выбранна оплата qr кодом")
        else-> println("Выбранна оплата оменна оплаты")
    }

    print("\n№11\nВведите группу крови(0,А,В,АВ): ")
    val a9 = readLine()!!.toString()
    when(a9){
        "0"-> println("можете отдать 0,А,В,АВ; можите принять 0")
        "A"-> println("можете отдать 0,В; можите принять 0,А")
        "B"-> println("можете отдать 0,А; можите принять 0,В")
        "AB"-> println("можете отдать 0; можите принять 0,А,В,АВ")
        else-> println("такой нет")
    }
    print("\n№12\nГде живёшь?: ")
    val a10 = readLine()!!.toString()
    when(a10){
        "россия"-> println("ты русский")
        "сша"-> println("ты американец")
        "япония"-> println("ты японец")
        "китай"-> println("ты китаец")
        else-> println("ты кто-то")
    }
    print("\n№13\nКод ошибки: ")
    val a11 = readLine()!!.toInt()
    when(a11){
        404-> println("Not found")
        403-> println("Forbidden")
        401-> println("Unauthorized")
        500-> println("Internal server error")
        503-> println("Service unavailable")
        else-> println("ты кто-то")
    }
}


