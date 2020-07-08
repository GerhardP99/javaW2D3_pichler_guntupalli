package sinduri;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //A1
        //Create a new cityList
        System.out.println("\nA1");
        ArrayList<String> cityList = new ArrayList<String>();

        cityList.add("Vienna");
        cityList.add("Graz");
        cityList.add("Linz");
        cityList.add("Salzburg");
        cityList.add("Innsbruck");
        cityList.add("Klagenfurt");

        //Using a for loop to print out the results
        for (int i = 0; i < cityList.size(); i++) {
            System.out.println(cityList.get(i) + " is a city of Austria.");
        }

        //Create a temperatureList
        ArrayList<Integer> temperatureList = new ArrayList<Integer>();

        temperatureList.add(21);
        temperatureList.add(18);
        temperatureList.add(16);
        temperatureList.add(19);
        temperatureList.add(17);
        temperatureList.add(18);

        //Using a for loop to print out the results
        for (int temperature: temperatureList) {
            System.out.println(temperature + "\u00B0C is the temperature somewhere in Austria.");
        }

        List<City> cityDetails = new ArrayList <City>();

        for (int i = 0; i < cityList.size(); i++) {
            cityDetails.add(new City(cityList.get(i), temperatureList.get(i)));
        }

        for (int i =0; i<cityDetails.size(); i++) {
            System.out.println(cityDetails.get(i).getCityName() + " has a temperature of " + cityDetails.get(i).getTemperatureCity() + "\u00B0C.");
        }

        //A2
        System.out.println("\nA2");






    }
}
