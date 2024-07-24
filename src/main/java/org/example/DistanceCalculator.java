package org.example;

public class DistanceCalculator {

    public static double calculateDistance(City city1, City city2) {
        double dx = city2.getX() - city1.getX();
        double dy = city2.getY() - city1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
