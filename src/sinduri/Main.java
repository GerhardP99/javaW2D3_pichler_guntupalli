package sinduri;

import java.util.*;

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

        //Using a for-Each loop to print out the results
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

        Collections.sort(cityList);

        for (int i = 0; i < cityList.size(); i++) {
            System.out.println(cityList.get(i) + " is a city of Austria.");
        }

        String[] villageArray = {"Hallstatt", "St. Gilgen", "St. Christoph am Arlberg"};

        cityList.addAll(Arrays.asList(villageArray));

        System.out.println("\nAfter adding villages:");

        for (int i = 0; i < cityList.size(); i++) {
            System.out.println(cityList.get(i) + " is a city/village of Austria.");
        }

        Scanner inputValue = new Scanner(System.in);

        System.out.print("\nEnter a city to find: ");
        String cityName = inputValue.nextLine();

        //Trying out contains() method in Collections
        String containsResult = (cityList.contains(cityName)) ?
                cityName + " is one of the cities in the list!" :
                cityName + " is not one of the cities in the list!";

        System.out.println(containsResult);

        //removeIf Method

        System.out.println("\nOriginal Temperature List:");

        for (int temperature: temperatureList) {
            System.out.println(temperature + "\u00B0C is the temperature somewhere in Austria.");
        }

        System.out.println("\nNew Temperature List:");

        temperatureList.removeIf(aElement -> (aElement % 2 == 0));

        for (int temperature: temperatureList) {
            System.out.println(temperature + "\u00B0C is the temperature somewhere in Austria.");
        }

        System.out.println("\nOriginal City List:");
        for (int i = 0; i < cityList.size(); i++) {
            System.out.println(cityList.get(i) + " is a city of Austria.");
        }

        cityList.removeIf(aElement -> (aElement.charAt(1) == 'i'));

        System.out.println("\nNew City List:");
        for (int i = 0; i < cityList.size(); i++) {
            System.out.println(cityList.get(i) + " is a city of Austria.");
        }

        //Adding Vienna to the front of the list

        cityList.add(0, "Vienna");
        System.out.println("\nUpdated City List:");
        for (int i = 0; i < cityList.size(); i++) {
            System.out.println(cityList.get(i) + " is a city of Austria.");
        }

        //A3
        System.out.println("\nA3");

        cityList.set(6, "Linz");
        System.out.println("\nUpdated City List by replacing St.Gilgen with Linz:");
        for (int i = 0; i < cityList.size(); i++) {
            System.out.println(cityList.get(i) + " is a city of Austria.");
        }

        cityList.remove(2);
        System.out.println("\nUpdated City List after removing 3rd element:");
        for (int i = 0; i < cityList.size(); i++) {
            System.out.println(cityList.get(i) + " is a city of Austria.");
        }

        //Sort and Reverse
        Collections.sort(cityList);
        System.out.println("\nSorted City List:");
        for (int i = 0; i < cityList.size(); i++) {
            System.out.println(cityList.get(i) + " is a city of Austria.");
        }

        Collections.reverse(cityList);
        System.out.println("\nSorted City List in Reverse Order:");
        for (int i = 0; i < cityList.size(); i++) {
            System.out.println(cityList.get(i) + " is a city of Austria.");
        }

        //A4
        System.out.println("\nA4");

        ArrayList<CityPopulation> cityPopulationList= new ArrayList<CityPopulation>();

        cityPopulationList.add(new CityPopulation("Vienna", 1911728));
        cityPopulationList.add(new CityPopulation("Sankt Polten", 1684623));
        cityPopulationList.add(new CityPopulation("Linz", 1490392));
        cityPopulationList.add(new CityPopulation("Graz", 1246576));
        cityPopulationList.add(new CityPopulation("Innsbruck", 757852));
        cityPopulationList.add(new CityPopulation("Klagenfurt", 561390));
        cityPopulationList.add(new CityPopulation("Salzburg", 558479));
        cityPopulationList.add(new CityPopulation("Bregenz", 397094));
        cityPopulationList.add(new CityPopulation("Eisenstadt", 294466));

        for(int i = 0; i < cityPopulationList.size(); i++) {
            System.out.printf("%-32s %-16s %n", cityPopulationList.get(i).getCityName(), cityPopulationList.get(i).getCityCitizensPopulation());
        }

        System.out.println("\nUsing AustrianCities Class\n");

        AustrianCities citiesPopulation = new AustrianCities(cityPopulationList);

        citiesPopulation.printAllCityData();




    }
}
