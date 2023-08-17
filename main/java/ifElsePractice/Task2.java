package ifElsePractice;

import java.util.Random;

//Учитывая целое число n выполните следующие условные действия:
//
// Если n нечетное, печать - Weird
// Если n является четным и находится в инклюзивном диапазоне 2 - 5, Распечатать - Not Weird
// Если n является четным и находится в инклюзивном диапазоне 6 - 20, Распечатать - Weird
// Если n четное и больше, чем 20, Распечатать - Not Weird
public class Task2 {
    public static void run2() {
        Random random = new Random();
        int n = random.nextInt(0, 100);
        if (n % 2 != 0 || (n % 2 == 0 && n >= 6 && n <= 20)) {
            System.out.println(n + " - Weird");
        }else {
            System.out.println(n + " - Not Weird");
        }
    }
}
