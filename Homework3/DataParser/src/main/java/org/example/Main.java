package org.example;

import org.example.DataExeptions.DataExeption;
import org.example.DataHandler.DataGetter;
import org.example.DataHandler.DataHandler;
import org.example.DataHandler.DataWriter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите параметры пользователя через пробел");
        System.out.println("Фамилия, имя, отчество латиницей");
        System.out.println("Дату рождения в формате ДД.MM.ГГГГ");
        System.out.println("Телефон в формате числа (без скобок и плюсов)");
        System.out.println("Пол одной буквой M/F");


        try {
            DataGetter dg = new DataGetter();
            dg.getDataFromUser();
            DataHandler dh = new DataHandler(dg.getData());
            dh.fillPersonData();
            DataWriter dw = new DataWriter(dh.getPerson());

        } catch (DataExeption e) {
            System.out.println("Ошибка: " + e.getErrorCode());
            System.out.println("Текст ошибки: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}