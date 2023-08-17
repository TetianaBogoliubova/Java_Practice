package ifElsePractice;

import java.util.Random;

//Создать программу, проверяющую и сообщающую на экран, является ли целое число записанное в
// переменную n, чётным либо нечётным.
public class Task1 {
    public static void run1() {

    Random random = new Random();
    int n = random.nextInt();

        if(n % 2 == 0) {
            System.out.println(n + " This number is even");
        }else {
            System.out.println(n + " This number is odd");
        }
    }
}
