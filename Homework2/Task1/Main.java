//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        float num = getFloatInput();
        System.out.println("Введённое число = "+num);
    }

    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите дробное число: ");
                float num = scanner.nextFloat();
                return num;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели некорректное значение. Попробуйте еще раз.");
                scanner.nextLine(); // очистка буфера ввода
            }
        }
    }
}
