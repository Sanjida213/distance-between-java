package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        String file = "src\\worldCities.csv";
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {

                String[] row = line.split((","));
                for(String index: row) {
                    System.out.printf("%10s", index);
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