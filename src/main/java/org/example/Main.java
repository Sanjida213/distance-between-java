package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String file = "src\\worldCities.csv";
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {

                String[] row = line.split((","));
                for(String word: row) {
                    System.out.printf("%20s", word);
                }
                System.out.println();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally{
            reader.close();
        }
    }
}