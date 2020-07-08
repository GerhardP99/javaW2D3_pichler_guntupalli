package sinduri.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class AustrianCities {
    ArrayList<CityPopulation> cityPopulationList;

    public AustrianCities(ArrayList<CityPopulation> cityPopulationList) {
        this.cityPopulationList = cityPopulationList;
    }

    public ArrayList<CityPopulation> getCityPopulationList() {
        return cityPopulationList;
    }

    public void setCityPopulationList(ArrayList<CityPopulation> cityPopulationList) {
        this.cityPopulationList = cityPopulationList;
    }

    public void printCityNames() {
        System.out.println("\nThe cities names in ascending order are:");
        Collections.sort(cityPopulationList, DataCompare.CityNameComparator1);

        for(int i = 0; i < this.cityPopulationList.size(); i++) {
            System.out.printf("%-32s %-16s %n", this.cityPopulationList.get(i).getCityName(), this.cityPopulationList.get(i).getCityCitizensPopulation());
        }

        System.out.println("\nThe cities names in descending order are:");
        Collections.sort(cityPopulationList, DataCompare.CityNameComparator2);

        for(int i = 0; i < this.cityPopulationList.size(); i++) {
            System.out.printf("%-32s %-16s %n", this.cityPopulationList.get(i).getCityName(), this.cityPopulationList.get(i).getCityCitizensPopulation());
        }
    }

    public void printCityPopulation() {
        System.out.println("\nThe cities by population in ascending order are:");
        Collections.sort(cityPopulationList, DataCompare.CityPopulationComparator1);

        for(int i = 0; i < this.cityPopulationList.size(); i++) {
            System.out.printf("%-32s %-16s %n", this.cityPopulationList.get(i).getCityName(), this.cityPopulationList.get(i).getCityCitizensPopulation());
        }

        System.out.println("\nThe cities by population in descending order are:");
        Collections.sort(cityPopulationList, DataCompare.CityPopulationComparator2);

        for(int i = 0; i < this.cityPopulationList.size(); i++) {
            System.out.printf("%-32s %-16s %n", this.cityPopulationList.get(i).getCityName(), this.cityPopulationList.get(i).getCityCitizensPopulation());
        }
    }

    public void printAllCityData() {
        System.out.printf("%-32s %-16s %n", "City", "Population");
        for(int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println("");
        for(int i = 0; i < this.cityPopulationList.size(); i++) {
            System.out.printf("%-32s %-16s %n", this.cityPopulationList.get(i).getCityName(), this.cityPopulationList.get(i).getCityCitizensPopulation());
        }
        for(int i = 0; i < 25; i++) {
            System.out.print("= ");
        }
        System.out.printf("%n%-32s %d %n", "TOTAL", printTotalNumberOfCitizens());
    }

    public int printTotalNumberOfCitizens() {
        int sumPopulation = 0;
        for(int i = 0; i < this.cityPopulationList.size(); i++) {
            sumPopulation += this.cityPopulationList.get(i).getCityCitizensPopulation();
        }
        return sumPopulation;
    }


}
