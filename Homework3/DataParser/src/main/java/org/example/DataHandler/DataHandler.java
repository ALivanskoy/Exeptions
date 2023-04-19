package org.example.DataHandler;

import org.example.DataExeptions.*;
import org.example.Person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataHandler {

    private String rawData;
    private String[] data;
    private Person person;

    final private int dataSize = 6;

    public DataHandler(String data) {
        this.rawData = data;
        this.person = new Person();
    }

    public void fillPersonData() throws DataExeption {

        String[] data = rawData.split(" ");


        if (data.length != dataSize) {
            throw new SizeDataExeption("Ошибка! Неверное количество параметров.");
        }

        if (this.isAlpha(data[0])&&this.isAlpha(data[1])&&this.isAlpha(data[2])){
            this.person.setLastName(data[0]);
            this.person.setFirstName(data[1]);
            this.person.setPatronymic(data[2]);
        } else {
            throw new NameDataExeption ("Ошибка! В  ФИО обнаружены недопустимые символы.");
        }


        LocalDate birthDate;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            birthDate = LocalDate.parse(data[3], formatter);
            this.person.setBirthDate(birthDate);
        } catch (Exception e) {
            throw new DateDataExeption("Ошибка! Неверный формат даты рождения.");
        }

        long phoneNumber;
        try {
            phoneNumber = Long.parseLong(data[4]);
            if (phoneNumber < 9 || phoneNumber > 12) throw new RuntimeException();
            this.person.setPhoneNumber(phoneNumber);
        } catch (Exception e) {
            throw new PhoneDataExeption("Ошибка! Неверный формат номера телефона.");
        }

        char gender;
        if (data[5].equalsIgnoreCase("f")) {
            gender = 'F';
            this.person.setGender(gender);
        } else if (data[5].equalsIgnoreCase("m")) {
            gender = 'M';
            this.person.setGender(gender);
        } else {
            throw new GenderDataExeption("Ошибка! Неверный формат пола.");
        }
    }

    public Person getPerson() {
        return person;
    }

    private static boolean isAlpha(String s)
    {
        if (s == null) {
            return false;
        }

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
                return false;
            }
        }
        return true;
    }
}
