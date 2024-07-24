package org.example;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "src\\worldCities.csv";
        CityList cityList = new CityList(filePath);
        UserInput userInput = new UserInput();

        String city1Name = userInput.getCityName("Enter the name of the first city:");
        String city2Name = userInput.getCityName("Enter the name of the second city:");

        City city1 = cityList.findCityByName(city1Name);
        City city2 = cityList.findCityByName(city2Name);

        if (city1 == null || city2 == null) {
            System.out.println("One or both cities not found in the database.");
        } else {
            double distance = calculateDistance(city1, city2);
            System.out.println("The distance between " + city1.getName() + " and " + city2.getName() + " is " + distance + " units.");
        }

        userInput.closeScanner();
    }

    private static double calculateDistance(City city1, City city2) {
        double dx = city2.getLatitude() - city1.getLatitude();
        double dy = city2.getLongitude() - city1.getLongitude();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
