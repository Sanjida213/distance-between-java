import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CityList {
    private List<City> cities;

    public CityList(String filePath) {
        cities = new ArrayList<>();
        loadCities(filePath);
    }

    private void loadCities(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                if (row.length < 3) continue;
                String name = row[0];
                double latitude = Double.parseDouble(row[1]);
                double longitude = Double.parseDouble(row[2]);
                cities.add(new City(name, latitude, longitude));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public City findCityByName(String name) {
        for (City city : cities) {
            if (city.getName().equalsIgnoreCase(name)) {
                return city;
            }
        }
        return null; // Return null if the city is not found
    }

    public List<City> getAllCities() {
        return cities;
    }
}
