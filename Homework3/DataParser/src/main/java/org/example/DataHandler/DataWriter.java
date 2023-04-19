package org.example.DataHandler;

import org.example.Person;

import java.io.FileWriter;
import java.io.IOException;

public class DataWriter {

    Person person;

    public DataWriter(Person person) {
        this.person = person;
    }

    public boolean write() {

        String fileName = person.getLastName() + ".txt";
        try (
                FileWriter writer = new FileWriter(fileName, true)) {

            writer.write("<" + person.getLastName() + ">" +
                    "<" + person.getFirstName() + ">" +
                    "<" + person.getPatronymic() + ">" +
                    "<" + person.getBirthDate() + ">" +
                    "<" + person.getPhoneNumber() + ">" +
                    "<" + person.getGender() + ">" +
                    "\n");
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

}

