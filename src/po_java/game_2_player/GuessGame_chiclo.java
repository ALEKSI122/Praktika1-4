package po_java.game_2_player;

import java.util.Scanner;


public class GuessGame_chiclo {

    static int first,second,number;

    public static void main (String [] ae) {

        Scanner s = new Scanner(System.in);

        number = (int)(Math.random()*100);



        System.out.println("Добро пожаловать в игру \"Угадай число\".");
        System.out.println("Играют два игрока.");
        System.out.println("Нужно вводить число в интревале от 1 до 100, кто первый угадал тот и выиграл. ");


        while(true) {

            System.out.println("Первый игрок введите число : ");
            first=s.nextInt();


            System.out.println("Второй игрок введите число : ");
            second=s.nextInt();

            if(first==number) {
                System.out.println("Поздравляем!!!Победил первый игрок!!! Это было число  - "+number);
                break;
            }
            if(second==number) {
                System.out.println("Поздравляем!!!Победил второй игрок!!! Это было число  - "+number);
                break;
            }

            else {

                System.out.println("Пока никто не угадал :(  Попробуйте еще.\n"+"                                                                                                                                                  "/*+number*/);
                System.out.println("Подсказка : ");
                if(first < number) {

                    System.out.println("Число первого игрока меньше искомого");

                }
                if(first > number) {

                    System.out.println("Число первого игрока больше искомого");

                }

                if (second < number) {

                    System.out.println("Число второго игрока меньше искомого\n");

                }

                if (second > number){

                    System.out.println("Число второго игрока больше искомого\n");


                }

            }


        }

    }

}