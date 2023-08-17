package palindorWord;

import java.util.Scanner;

//Создать программу, которая будет проверять, является ли слово из пяти букв, введённое пользователем,
// палиндромом (примеры: «комок», «ротор»). Если введено слово не из 5 букв, то сообщать об ошибке.
// Программа должна нормально обрабатывать слово, даже если в нём использованы символы разного регистра.
// Например, слова «Комок» или «РОТОР» следует также считать палиндромами.
public class Task1 {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        String myWord = scanner.next();

        char[] strToArray = myWord.toCharArray(); //преобразовываем строку в массив символов
        if (strToArray[0] == strToArray[4] && strToArray[1] == strToArray[3]) {
            System.out.println("This is palindrom");
        } else System.out.println("This is no palindrom");
        if (strToArray.length != 5) {
            System.out.println("This is mistake");
        }
    }

}
