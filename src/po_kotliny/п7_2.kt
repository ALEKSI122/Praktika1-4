package po_kotliny
import kotlin.random.Random
import kotlin.system.exitProcess


fun main(){
    println("Чтобы начать нажмите Enter")
    val c = readLine()!!
    if (c == ""){
        println("Добро пожаловать!")
        Thread.sleep(1000)
        println("Это Игра Blackjack (очко или двадцать одно)")
        Thread.sleep(3000)
        println("Перед началом узнайте где-нибудь правила игры")
        Thread.sleep(3000)
        print("В одной стопке 4 колоды так что не удивляйтесь если выпадут одинаковые карты\nТак же очки карт немного изменены\nНажмите 1 - если хотите ознакомиться с новыми очками карт\nНажмите 2 - если не хотите ознакамливаться\nВаш выбор: ")// Нажмите 3 - чтобы перейти к игре (если вы играете уже не первый раз)
        val a = readLine()!!.toInt()
        when(a){
            1->ochki()
            else->balans()
        }
    }else{
        balans()
    }
}
fun ochki() {
    print("Любая масть:\n" +
            "Карта 2 - 2 очка;\n" +
            "Карта 3 - 3 очка;\n" +
            "Карта 4 - 4 очка;\n" +
            "Карта 5 - 5 очков;\n" +
            "Карта 6 - 6 очков;\n" +
            "Карта 7 - 7 очков;\n" +
            "Карта 8 - 8 очков;\n" +
            "Карта 9 - 9 очков;\n" +
            "Карта 10 - 10 очков;\n" +
            "Карта Валет - 10 очков;\n" +
            "Карта Дама - 10 очков;\n" +
            "Карта Кароль - 10 очков;\n" +
            "Карта Туз - либо 1 очко(не доделано), либо 11 очков;\n" +
            "Если вам выпал Туз можете считать как хотите сколько он значит очков!\nНажмите Enter чтобы продолжить")
    val b = readLine()!!
    if (b == ""){
        balans()
    }
}
fun ysl(sumoi:Int,sumod:Int,coin: Int,f:Int,del:Int,f2:Int){
    var oin = coin
    if (sumoi == sumod){
        if (del == 2) {
            oin += f2
            val per = oin
            nn(coin = per)
        }else{
            oin += f
            val per = oin
            nn(coin = per)
        }
    }else if(sumoi == 21){
        if (sumod < 21){
            if (del == 2) {
                oin += f2 * 2
                val per = oin
                win(coin = per)
            }else{
                oin += f2
                val per = oin
                win(coin = per)
            }
        }
    }else if (sumod == 21){
        if (sumoi < 21){
            val per = oin
            lose(coin = per)
        }
    }else if(sumoi > 21){
        if (sumod < 21){
            val per = oin
            lose(coin = per)
        }else{
            if (del == 2) {
                oin += f2
                val per = oin
                nn(coin = per)
            }else{
                oin += f
                val per = oin
                nn(coin = per)
            }
        }
    }else if(sumod > 21){
        if (sumoi < 21){
            if (del == 2) {
                oin += f2 * 2
                val per = oin
                win(coin = per)
            }else{
                oin += f2
                val per = oin
                win(coin = per)
            }
        }else{
            if (del == 2) {
                oin += f2
                val per = oin
                nn(coin = per)
            }else{
                oin += f
                val per = oin
                nn(coin = per)
            }
        }
    }else if (sumoi < sumod){
        val per = oin
        lose(coin = per)
    }else if (sumoi > sumod){
        if (del == 2) {
            oin += f2 * 2
            val per = oin
            win(coin = per)
        }else{
            oin += f2
            val per = oin
            win(coin = per)
        }
    }else{
        print("я что-то упустил")
        exitProcess(-1)
    }
}
fun win(coin:Int){
    Thread.sleep(2000)
    println("\nПоздравляю вы победили\nХотите сыграть ещё?\n1 - Да\n2 - Нет\nВаш выбор: ")
    val vo = readLine()!!.toInt()
    if (vo == 1){
        balans(coi=coin)
    }else{
        exitProcess(-1)
    }
}
fun nn(coin:Int){
    Thread.sleep(2000)
    println("\nНичья\nХотите сыграть ещё?\n1 - Да\n2 - Нет\nВаш выбор: ")
    val vo = readLine()!!.toInt()
    if (vo == 1){
        balans(coi=coin)
    }else{
        exitProcess(-1)
    }
}
fun lose(coin:Int){
    Thread.sleep(2000)
    println("\nВы проиграли\nХотите сыграть ещё?\n1 - Да\n2 - Нет\nВаш выбор: ")
    val vo = readLine()!!.toInt()
    if (vo == 1){
        balans(coi=coin)
    }else{
        exitProcess(-1)
    }
}
fun kard(kar:Int,nom:Int) : Int{
    var sum = 0
    when (kar) {
       1 -> {
           when(nom){
               2,3,4,5,6,7,8,9,10->{print("\n$nom♠");sum = nom;return sum}
               11->{print("\nВалет♠");sum = 10;return sum}
               12->{print("\nДама♠");sum = 10;return sum}
               13->{print("\nКароль♠");sum = 10;return sum}
               else->{print("\nТуз♠");sum = 11;return sum}
           }
       }
       2 -> {
           when(nom){
               2,3,4,5,6,7,8,9,10->{print("\n$nom♦");sum = nom;return sum}
               11->{print("\nВалет♦");sum = 10;return sum}
               12->{print("\nДама♦");sum = 10;return sum}
               13->{print("\nКароль♦");sum = 10;return sum}
               else->{print("\nТуз♦");sum = 11;return sum}
           }
       }
       3 -> {
           when(nom){
               2,3,4,5,6,7,8,9,10->{print("\n$nom♣");sum = nom;return sum}
               11->{print("\nВалет♣");sum = 10;return sum}
               12->{print("\nДама♣");sum = 10;return sum}
               13->{print("\nКароль♣");sum = 10;return sum}
               else->{print("\nТуз♣");sum = 11;return sum}
           }
       }
       else -> {
           when(nom){
               2,3,4,5,6,7,8,9,10->{print("\n$nom♥");sum = nom;return sum}
               11->{print("\nВалет♥");sum = 10;return sum}
               12->{print("\nДама♥");sum = 10;return sum}
               13->{print("\nКароль♥");sum = 10;return sum}
               else->{print("\nТуз♥");sum = 11;return sum}
           }
       }
   }
}
fun dil(sumoi: Int,coin: Int,f: Int, del: Int, f2: Int,
        kar1d:Int, kar2d:Int, kar3d:Int, kar4d:Int, kar5d:Int, kar6d:Int, kar7d:Int,
        nom1d:Int, nom2d:Int, nom3d:Int, nom4d:Int, nom5d:Int, nom6d:Int, nom7d:Int, ){
    val kar1dt = kar1d
    val nom1dt = nom1d
    val kar2dt = kar2d
    val nom2dt = nom2d
    val kar3dt = kar3d
    val nom3dt = nom3d
    val kar4dt = kar4d
    val nom4dt = nom4d
    val kar5dt = kar5d
    val nom5dt = nom5d
    val kar6dt = kar6d
    val nom6dt = nom6d
    val kar7dt = kar7d
    val nom7dt = nom7d
    print("\nДилер переворачивает свою первую карту\nКарты Дитера: ")
    Thread.sleep(2000)
    var sum1d = kard(kar1dt,nom1dt)
    Thread.sleep(2000)
    var sum2d = kard(kar2dt,nom2dt)
    Thread.sleep(2000)
    var sumod = sum1d + sum2d
    println("\nCумма карт Дилера = $sumod")
    if (sumod >= 17){
        ysl(sumoi,sumod,coin,f,del,f2)
    }else{
        Thread.sleep(1000)
        print("\nДилер берет карту: ")
        sum1d = kard(kar1dt,nom1dt)
        sum2d = kard(kar2dt,nom2dt)
        Thread.sleep(2000)
        var sum3d = kard(kar3dt,nom3dt)
        Thread.sleep(2000)
        sumod = sum1d + sum2d + sum3d
        println("\nCумма карт Дилера = $sumod")
        if (sumod >= 17){
            ysl(sumoi,sumod,coin,f,del,f2)
        }else{
            Thread.sleep(1000)
            print("\nДилер берет ещё карту: ")
            sum1d = kard(kar1dt,nom1dt)
            sum2d = kard(kar2dt,nom2dt)
            sum3d = kard(kar3dt,nom3dt)
            Thread.sleep(2000)
            var sum4d = kard(kar4dt,nom4dt)
            Thread.sleep(2000)
            sumod = sum1d + sum2d + sum3d + sum4d
            println("\nCумма карт Дилера = $sumod")
            if (sumod >= 17){
                ysl(sumoi,sumod,coin,f,del,f2)
            }else{
                Thread.sleep(1000)
                print("\nДилер берет ещё карту: ")
                sum1d = kard(kar1dt,nom1dt)
                sum2d = kard(kar2dt,nom2dt)
                sum3d = kard(kar3dt,nom3dt)
                sum4d = kard(kar4dt,nom4dt)
                Thread.sleep(2000)
                var sum5d = kard(kar5dt,nom5dt)
                Thread.sleep(2000)
                sumod = sum1d + sum2d + sum3d + sum4d + sum5d
                println("\nCумма карт Дилера = $sumod")
                if (sumod >= 17){
                    ysl(sumoi,sumod,coin,f,del,f2)
                }else{
                    Thread.sleep(1000)
                    print("\nДилер берет ещё карту: ")
                    sum1d = kard(kar1dt,nom1dt)
                    sum2d = kard(kar2dt,nom2dt)
                    sum3d = kard(kar3dt,nom3dt)
                    sum4d = kard(kar4dt,nom4dt)
                    sum5d = kard(kar5dt,nom5dt)
                    Thread.sleep(2000)
                    var sum6d = kard(kar6dt,nom6dt)
                    Thread.sleep(2000)
                    sumod = sum1d + sum2d + sum3d + sum4d + sum5d + sum6d
                    println("\nCумма карт Дилера = $sumod")
                    if (sumod >= 17){
                        ysl(sumoi,sumod,coin,f,del,f2)
                    }else{
                        Thread.sleep(1000)
                        print("\nДилер берет ещё карту: ")
                        sum1d = kard(kar1dt,nom1dt)
                        sum2d = kard(kar2dt,nom2dt)
                        sum3d = kard(kar3dt,nom3dt)
                        sum4d = kard(kar4dt,nom4dt)
                        sum5d = kard(kar5dt,nom5dt)
                        sum6d = kard(kar6dt,nom6dt)
                        Thread.sleep(2000)
                        var sum7d = kard(kar7dt,nom7dt)
                        Thread.sleep(2000)
                        sumod = sum1d + sum2d + sum3d + sum4d + sum5d + sum6d + sum7d
                        println("\nCумма карт Дилера = $sumod")
                        if (sumod >= 17){
                            ysl(sumoi,sumod,coin,f,del,f2)
                        }else{
                            Thread.sleep(1000)
                            println("Максимум 7 карт")
                            ysl(sumoi,sumod,coin,f,del,f2)
                        }
                    }
                }
            }
        }
    }
}
fun balans(coi: Int = 100000) {
    var coin = 100000
    if(coi > 0){
        coin = coi
        game(coin)
    }else if (coi <= 0){
        Thread.sleep(2000)
        println("\nВы проиграли все ваши деньги, к сожалению для вас игра закончена")
        exitProcess(-1)
    }else{
        game(coin)
    }
}

fun game(oi: Int,sum:Int = 0){
    var coin = oi
    println("\nВаш баланс: $coin")
    while (true) {
        Thread.sleep(1000)
        print("Игра начинается\nСделайте ставку (min 1000, max 50000): ")
        var f = 0
        var f2 =0
        while (f == 0) {
            val c = readLine()!!.toInt()
            if ((c >= 1000) and (c <= 50000)) {
                f = c
            }else{
                print("Ошибка min 1000, max 50000: ")
                f = 0
            }
        }
        coin -= f
        println("\nВаша ставка: $f")
        val kar1i = Random.nextInt(1,4)
        val nom1i = Random.nextInt(2,14)
        var sum1i = 0
        //var t1i = 1
        val kar2i = Random.nextInt(1,4)
        val nom2i = Random.nextInt(2,14)
        var sum2i = 0
        //var t2i = 1
        val kar3i = Random.nextInt(1,4)
        val nom3i = Random.nextInt(2,14)
        var sum3i = 0
        //var t3i = 1
        val kar4i = Random.nextInt(1,4)
        val nom4i = Random.nextInt(2,14)
        var sum4i = 0
        //var t4i = 1
        val kar5i = Random.nextInt(1,4)
        val nom5i = Random.nextInt(2,14)
        var sum5i = 0
        //var t5i = 1
        val kar6i = Random.nextInt(1,4)
        val nom6i = Random.nextInt(2,14)
        var sum6i = 0
        //var t6i = 1
        val kar7i = Random.nextInt(1,4)
        val nom7i = Random.nextInt(2,14)
        var sum7i = 0
        //var t7i = 1
        val kar1d = Random.nextInt(1,4)
        val nom1d = Random.nextInt(2,14)
        var sum1d = 0
        //var t1d = 1
        val kar2d = Random.nextInt(1,4)
        val nom2d = Random.nextInt(2,14)
        var sum2d = 0
        //var t2d = 1
        val kar3d = Random.nextInt(1,4)
        val nom3d = Random.nextInt(2,14)
        var sum3d = 0
        //var t3d = 1
        val kar4d = Random.nextInt(1,4)
        val nom4d = Random.nextInt(2,14)
        var sum4d = 0
        //var t4d = 1
        val kar5d = Random.nextInt(1,4)
        val nom5d = Random.nextInt(2,14)
        var sum5d = 0
        //var t5d = 1
        val kar6d = Random.nextInt(1,4)
        val nom6d = Random.nextInt(2,14)
        var sum6d = 0
        //var t6d = 1
        val kar7d = Random.nextInt(1,4)
        val nom7d = Random.nextInt(2,14)
        var sum7d = 0
        //var t7d = 1
        Thread.sleep(1000)
        println("\nДилер выдаёт себе карты: ")
        Thread.sleep(2000)
        print("Первая карта скрыта до подведения результатов\n??")
        Thread.sleep(2000)
        sum2d =  kard(kar2d,nom2d)
        Thread.sleep(2000)
        println("\nCумма карт Дилера = $sum2d + ?")
        Thread.sleep(1000)
        print("\nДилер выдаёт вам карты: ")
        Thread.sleep(2000)
        sum1i = kard(kar1i,nom1i)
        Thread.sleep(2000)
        sum2i = kard(kar2i,nom2i)
        Thread.sleep(2000)
        var sumoi = sum1i + sum2i
        if ((nom1i == 14) and (nom2i == 14)){
            coin += f * 2
            print("\nВам выпало два туза")
            val per = coin
            win(coin = per)
        }else if ((nom1i == 14) or (nom2i == 14)){
            print("\nCумма ваших карт = $sumoi")// или ${t1i + sum2i}
        }else if(nom1i == nom2i){
            print("\nCумма ваших карт = $sumoi")
            //val sp = 1
        }else{
            print("\nCумма ваших карт = $sumoi")
        }
        Thread.sleep(1000)
        print("\n\nВаши действия:\n1 - взять\n2 - удвоить ставку\n3 - хватит\nВаш выбор: ")
        var dey = readLine()!!.toInt()
        when(dey){
            1->{
                Thread.sleep(2000)
                print("\nВаши карты: ")
                sum1i = kard(kar1i,nom1i)
                sum2i = kard(kar2i,nom2i)
                Thread.sleep(2000)
                sum3i = kard(kar3i,nom3i)
                Thread.sleep(2000)
                sumoi = sum1i + sum2i + sum3i
                //if (((nom1i == 14) or (nom2i == 14)) and (nom3i == 14)){
                print("\nCумма ваших карт = $sumoi")// или ${t1i + sum2i}
                //}else{
                //    print("\nCумма ваших карт = $sumoi")
                //}
                Thread.sleep(1000)
                if (sumoi > 21){
                    dil(sumoi,coin,f,del=dey,f2=f2,kar1d,kar2d,kar3d,kar4d,kar5d,kar6d,kar7d,nom1d,nom2d,nom3d,nom4d,nom5d,nom6d,nom7d)
                }else {
                    print("\n\nВаши действия:\n1 - взять\n2 - удвоить ставку\n3 - хватит\nВаш выбор: ")
                    dey = readLine()!!.toInt()
                    when (dey) {
                        1 -> {
                            Thread.sleep(2000)
                            print("\nВаши карты: ")
                            sum1i = kard(kar1i, nom1i)
                            sum2i = kard(kar2i, nom2i)
                            sum3i = kard(kar3i, nom3i)
                            Thread.sleep(2000)
                            sum4i = kard(kar4i, nom4i)
                            Thread.sleep(2000)
                            sumoi = sum1i + sum2i + sum3i + sum4i
                            //if (((nom1i == 14) or (nom2i == 14)) and (nom3i == 14)){
                            print("\nCумма ваших карт = $sumoi")// или ${t1i + sum2i}
                            //}else{
                            //    print("\nCумма ваших карт = $sumoi")
                            //}
                            Thread.sleep(1000)
                            if (sumoi > 21){
                                dil(sumoi,coin,f,del=dey,f2=f2,kar1d,kar2d,kar3d,kar4d,kar5d,kar6d,kar7d,nom1d,nom2d,nom3d,nom4d,nom5d,nom6d,nom7d)
                            }else {
                                print("\n\nВаши действия:\n1 - взять\n2 - удвоить ставку\n3 - хватит\nВаш выбор: ")
                                dey = readLine()!!.toInt()
                                when (dey) {
                                    1 -> {
                                        Thread.sleep(2000)
                                        print("\nВаши карты: ")
                                        sum1i = kard(kar1i, nom1i)
                                        sum2i = kard(kar2i, nom2i)
                                        sum3i = kard(kar3i, nom3i)
                                        sum4i = kard(kar4i, nom4i)
                                        Thread.sleep(2000)
                                        sum5i = kard(kar5i, nom5i)
                                        Thread.sleep(2000)
                                        sumoi = sum1i + sum2i + sum3i + sum4i + sum5i
                                        //if (((nom1i == 14) or (nom2i == 14)) and (nom3i == 14)){
                                        print("\nCумма ваших карт = $sumoi")// или ${t1i + sum2i}
                                        //}else{
                                        //    print("\nCумма ваших карт = $sumoi")
                                        //}
                                        Thread.sleep(1000)
                                        if (sumoi > 21) {
                                            dil(sumoi,coin,f,del=dey,f2=f2,kar1d,kar2d,kar3d,kar4d,kar5d,kar6d,kar7d,nom1d,nom2d,nom3d,nom4d,nom5d,nom6d,nom7d)
                                        } else {
                                            print("\n\nВаши действия:\n1 - взять\n2 - удвоить ставку\n3 - хватит\nВаш выбор: ")
                                            dey = readLine()!!.toInt()
                                            when (dey) {
                                                1 -> {
                                                    Thread.sleep(2000)
                                                    print("\nВаши карты: ")
                                                    sum1i = kard(kar1i, nom1i)
                                                    sum2i = kard(kar2i, nom2i)
                                                    sum3i = kard(kar3i, nom3i)
                                                    sum4i = kard(kar4i, nom4i)
                                                    sum5i = kard(kar5i, nom5i)
                                                    Thread.sleep(2000)
                                                    sum6i = kard(kar6i, nom6i)
                                                    Thread.sleep(2000)
                                                    sumoi = sum1i + sum2i + sum3i + sum4i + sum5i + sum6i
                                                    //if (((nom1i == 14) or (nom2i == 14)) and (nom3i == 14)){
                                                    print("\nCумма ваших карт = $sumoi")// или ${t1i + sum2i}
                                                    //}else{
                                                    //    print("\nCумма ваших карт = $sumoi")
                                                    //}
                                                    Thread.sleep(1000)
                                                    if (sumoi > 21) {
                                                        dil(sumoi,coin,f,del=dey,f2=f2,kar1d,kar2d,kar3d,kar4d,kar5d,kar6d,kar7d,nom1d,nom2d,nom3d,nom4d,nom5d,nom6d,nom7d)
                                                    } else {
                                                        print("\n\nВаши действия:\n1 - взять\n2 - удвоить ставку\n3 - хватит\nВаш выбор: ")
                                                        dey = readLine()!!.toInt()
                                                        when (dey) {
                                                            1 -> {
                                                                Thread.sleep(2000)
                                                                print("\nВаши карты: ")
                                                                sum1i = kard(kar1i, nom1i)
                                                                sum2i = kard(kar2i, nom2i)
                                                                sum3i = kard(kar3i, nom3i)
                                                                sum4i = kard(kar4i, nom4i)
                                                                sum5i = kard(kar5i, nom5i)
                                                                sum6i = kard(kar6i, nom6i)
                                                                Thread.sleep(2000)
                                                                sum7i = kard(kar6i, nom6i)
                                                                Thread.sleep(2000)
                                                                sumoi = sum1i + sum2i + sum3i + sum4i + sum5i + sum6i + sum7i
                                                                //if (((nom1i == 14) or (nom2i == 14)) and (nom3i == 14)){
                                                                print("\nCумма ваших карт = $sumoi")// или ${t1i + sum2i}
                                                                //}else{
                                                                //    print("\nCумма ваших карт = $sumoi")
                                                                //}
                                                                Thread.sleep(1000)
                                                                println("Максимум 7 карт")
                                                                dil(sumoi,coin,f,del=dey,f2=f2,kar1d,kar2d,kar3d,kar4d,kar5d,kar6d,kar7d,nom1d,nom2d,nom3d,nom4d,nom5d,nom6d,nom7d)
                                                            }
                                                            2 -> {
                                                                coin -= f
                                                                println("\nВаша ставка теперь: ${f*2}")
                                                                Thread.sleep(2000)
                                                                print("\nВаши карты: ")
                                                                sum1i = kard(kar1i, nom1i)
                                                                sum2i = kard(kar2i, nom2i)
                                                                sum3i = kard(kar3i, nom3i)
                                                                sum4i = kard(kar4i, nom4i)
                                                                sum5i = kard(kar5i, nom5i)
                                                                sum6i = kard(kar6i, nom6i)
                                                                Thread.sleep(2000)
                                                                sum7i = kard(kar6i, nom6i)
                                                                Thread.sleep(2000)
                                                                sumoi = sum1i + sum2i + sum3i + sum4i + sum5i + sum6i + sum7i
                                                                //if (((nom1i == 14) or (nom2i == 14)) and (nom3i == 14)){
                                                                print("\nCумма ваших карт = $sumoi")// или ${t1i + sum2i}
                                                                //}else{
                                                                //    print("\nCумма ваших карт = $sumoi")
                                                                //}
                                                                Thread.sleep(1000)
                                                                dil(sumoi,coin,f,del=dey,f2=f2,kar1d,kar2d,kar3d,kar4d,kar5d,kar6d,kar7d,nom1d,nom2d,nom3d,nom4d,nom5d,nom6d,nom7d)
                                                            }
                                                            else -> {
                                                                dil(sumoi,coin,f,del=dey,f2=f2,kar1d,kar2d,kar3d,kar4d,kar5d,kar6d,kar7d,nom1d,nom2d,nom3d,nom4d,nom5d,nom6d,nom7d)
                                                            }
                                                        }
                                                    }
                                                }
                                                2 -> {
                                                    coin -= f
                                                    println("\nВаша ставка теперь: ${f*2}")
                                                    Thread.sleep(2000)
                                                    print("\nВаши карты: ")
                                                    sum1i = kard(kar1i, nom1i)
                                                    sum2i = kard(kar2i, nom2i)
                                                    sum3i = kard(kar3i, nom3i)
                                                    sum4i = kard(kar4i, nom4i)
                                                    sum5i = kard(kar5i, nom5i)
                                                    Thread.sleep(2000)
                                                    sum6i = kard(kar6i, nom6i)
                                                    Thread.sleep(2000)
                                                    sumoi = sum1i + sum2i + sum3i + sum4i + sum5i + sum6i
                                                    //if (((nom1i == 14) or (nom2i == 14)) and (nom3i == 14)){
                                                    print("\nCумма ваших карт = $sumoi")// или ${t1i + sum2i}
                                                    //}else{
                                                    //    print("\nCумма ваших карт = $sumoi")
                                                    //}
                                                    Thread.sleep(1000)
                                                    dil(sumoi,coin,f,del=dey,f2=f2,kar1d,kar2d,kar3d,kar4d,kar5d,kar6d,kar7d,nom1d,nom2d,nom3d,nom4d,nom5d,nom6d,nom7d)
                                                }
                                                else -> {
                                                    dil(sumoi,coin,f,del=dey,f2=f2,kar1d,kar2d,kar3d,kar4d,kar5d,kar6d,kar7d,nom1d,nom2d,nom3d,nom4d,nom5d,nom6d,nom7d)
                                                }
                                            }
                                        }
                                    }
                                    2 -> {
                                        coin -= f
                                        println("\nВаша ставка теперь: ${f*2}")
                                        Thread.sleep(2000)
                                        print("\nВаши карты: ")
                                        sum1i = kard(kar1i, nom1i)
                                        sum2i = kard(kar2i, nom2i)
                                        sum3i = kard(kar3i, nom3i)
                                        sum4i = kard(kar4i, nom4i)
                                        Thread.sleep(2000)
                                        sum5i = kard(kar5i, nom5i)
                                        Thread.sleep(2000)
                                        sumoi = sum1i + sum2i + sum3i + sum4i + sum5i
                                        //if (((nom1i == 14) or (nom2i == 14)) and (nom3i == 14)){
                                        print("\nCумма ваших карт = $sumoi")// или ${t1i + sum2i}
                                        //}else{
                                        //    print("\nCумма ваших карт = $sumoi")
                                        //}
                                        Thread.sleep(1000)
                                        dil(sumoi,coin,f,del=dey,f2=f2,kar1d,kar2d,kar3d,kar4d,kar5d,kar6d,kar7d,nom1d,nom2d,nom3d,nom4d,nom5d,nom6d,nom7d)
                                    }
                                    else -> {
                                        dil(sumoi,coin,f,del=dey,f2=f2,kar1d,kar2d,kar3d,kar4d,kar5d,kar6d,kar7d,nom1d,nom2d,nom3d,nom4d,nom5d,nom6d,nom7d)
                                    }
                                }
                            }
                        }
                        2 -> {

                            coin -= f
                            println("\nВаша ставка теперь: ${f*2}")
                            Thread.sleep(2000)
                            print("\nВаши карты: ")
                            sum1i = kard(kar1i, nom1i)
                            sum2i = kard(kar2i, nom2i)
                            sum3i = kard(kar3i, nom3i)
                            Thread.sleep(2000)
                            sum4i = kard(kar4i, nom4i)
                            Thread.sleep(2000)
                            sumoi = sum1i + sum2i + sum3i + sum4i
                            //if (((nom1i == 14) or (nom2i == 14)) and (nom3i == 14)){
                            print("\nCумма ваших карт = $sumoi")// или ${t1i + sum2i}
                            //}else{
                            //    print("\nCумма ваших карт = $sumoi")
                            //}
                            Thread.sleep(1000)
                            dil(sumoi,coin,f,del=dey,f2=f2,kar1d,kar2d,kar3d,kar4d,kar5d,kar6d,kar7d,nom1d,nom2d,nom3d,nom4d,nom5d,nom6d,nom7d)
                        }
                        else -> {
                            dil(sumoi,coin,f,del=dey,f2=f2,kar1d,kar2d,kar3d,kar4d,kar5d,kar6d,kar7d,nom1d,nom2d,nom3d,nom4d,nom5d,nom6d,nom7d)
                        }
                    }
                }
            }
            2->{
                f2 = f*2
                coin -= f2
                println("\nВаша ставка теперь: $f2")
                Thread.sleep(2000)
                print("\nВаши карты: ")
                sum1i = kard(kar1i,nom1i)
                sum2i = kard(kar2i,nom2i)
                Thread.sleep(2000)
                sum3i = kard(kar3i,nom3i)
                Thread.sleep(2000)
                sumoi = sum1i + sum2i + sum3i
                //if (((nom1i == 14) or (nom2i == 14)) and (nom3i == 14)){
                print("\nCумма ваших карт = $sumoi")// или ${t1i + sum2i}
                //}else{
                //    print("\nCумма ваших карт = $sumoi")
                //}
                Thread.sleep(1000)
                dil(sumoi,coin,f,del=dey,f2=f2,kar1d,kar2d,kar3d,kar4d,kar5d,kar6d,kar7d,nom1d,nom2d,nom3d,nom4d,nom5d,nom6d,nom7d)
            }
            else->{
                dil(sumoi,coin,f,del=dey,f2=f2,kar1d,kar2d,kar3d,kar4d,kar5d,kar6d,kar7d,nom1d,nom2d,nom3d,nom4d,nom5d,nom6d,nom7d)
            }
        }
    }
}

