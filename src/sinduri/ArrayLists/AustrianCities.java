package sinduri.ArrayLists;

import java.util.ArrayList;

public class AustrianCities {
    ArrayList<CityPopulation> cityPopulationList;

    public AustrianCities(ArrayList<CityPopulation> cityPopulationList) {
        this.cityPopulationList = cityPopulationList;
    }

    public void printCityNames() {
        System.out.println("The cities names are:");
        for(int i = 0; i < this.cityPopulationList.size(); i++) {
            System.out.printf("%-32s %n", this.cityPopulationList.get(i).getCityName());
        }
    }

    public void printCityPopulation() {
        System.out.println("The cities population are:");
        for(int i = 0; i < this.cityPopulationList.size(); i++) {
            System.out.printf("%-32s %n", this.cityPopulationList.get(i).getCityCitizensPopulation());
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
