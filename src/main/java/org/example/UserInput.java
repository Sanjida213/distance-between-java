package org.example;

import java.util.Scanner;

public class UserInput {
    private final Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }

    public String getCityName(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine().trim();
    }

    public void closeScanner() {
        scanner.close();
    }
}