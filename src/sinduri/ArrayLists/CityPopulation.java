package sinduri.ArrayLists;

import java.util.Comparator;

public class CityPopulation {

    String cityName;
    int cityCitizensPopulation;

    public CityPopulation(String cityName, int cityCitizensPopulation) {
        this.cityName = cityName;
        this.cityCitizensPopulation = cityCitizensPopulation;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCitizensPopulation() {
        return cityCitizensPopulation;
    }

    public void setCityCitizensPopulation(int cityCitizensPopulation) {
        this.cityCitizensPopulation = cityCitizensPopulation;
    }

    public static Comparator<CityPopulation> CityNameComparator1 = new Comparator<CityPopulation>() {
        public int compare (CityPopulation c1, CityPopulation c2) {
            return (c1.getCityName()).compareTo(c2.getCityName());
        }
    };

    public static Comparator<CityPopulation> CityNameComparator2 = new Comparator<CityPopulation>() {
        public int compare (CityPopulation c1, CityPopulation c2) {
            return (c2.getCityName()).compareTo(c1.getCityName());
        }
    };

/*    public static Comparator<CityPopulation> CityPopulationComparator1 = new Comparator<CityPopulation>() {
        public int compare (CityPopulation c1, CityPopulation c2) {
            return (c1.getCityCitizensPopulation()).compareTo(c2.getCityCitizensPopulation());
        }
    };

    public static Comparator<CityPopulation> CityPopulationComparator2 = new Comparator<CityPopulation>() {
        public int compare (CityPopulation c1, CityPopulation c2) {
            return (c2.getCityCitizensPopulation()).compareTo(c1.getCityCitizensPopulation());
        }
    };*/
}
