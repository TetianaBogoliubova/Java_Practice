
// Программа должна считать количество попыток, которое потребовалось пользователю, чтобы угадать
// число. И в конце сообщать, сколько было попыток.
//
//  Программа должна подсказывать пользователю, что он ошибся в знаке, если программа загадала
//  положительное число, а пользователь ввёл отрицательное. И наоборот */
package guessNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static int winNumber;
    public static int inputNumber;

    public static void getNumber() {

        do {
            Random random = new Random();
            winNumber = random.nextInt(-10, 10);

        } while (winNumber == 0);
        System.out.println("The program wishes a number");
    }

    public static void enterErrorNumber() {
        int i = 0;

        do {
            i++;
            Scanner scanner = new Scanner(System.in);
            inputNumber = scanner.nextInt();

            if (inputNumber == winNumber) {
                System.out.println("You winn! Attempt - # " + i);
            } else {
                if (inputNumber != winNumber) ;
                System.out.println("You don't winn - # " + i);

                if (inputNumber < 0 && winNumber > 0)
                    System.out.println("You enter negative number, but you should enter positive number");

                if (inputNumber > 0 && winNumber < 0)
                    System.out.println("You enter positive  number, but you should enter negative number");
            }

        } while (inputNumber != winNumber);

    }
}
