package org.example.DataHandler;

import java.util.Scanner;

public class DataGetter {
    private String data;

    public void getDataFromUser() {

        try (
                Scanner scanner = new Scanner(System.in);
        ) {
            this.data = scanner.nextLine();
        }
    }

    public String getData() {
        return data;
    }
}
