//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Введите строку: ");
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя");
            }
            System.out.println("Вы ввели: " + str);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

