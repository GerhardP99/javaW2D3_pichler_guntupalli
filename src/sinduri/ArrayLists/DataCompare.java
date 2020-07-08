package sinduri.ArrayLists;

import java.util.Comparator;

public class DataCompare {
    public static Comparator<CityPopulation> CityNameComparator1 = new Comparator<CityPopulation>() {
        public int compare(CityPopulation c1, CityPopulation c2) {
            return (c1.getCityName()).compareTo(c2.getCityName());
        }
    };

    public static Comparator<CityPopulation> CityNameComparator2 = new Comparator<CityPopulation>() {
        public int compare (CityPopulation c1, CityPopulation c2) {
            return (c2.getCityName()).compareTo(c1.getCityName());
        }
    };

    public static Comparator<CityPopulation> CityPopulationComparator1 = new Comparator<CityPopulation>() {
        public int compare (CityPopulation c1, CityPopulation c2) {
            return (c1.getCityCitizensPopulation()) - (c2.getCityCitizensPopulation());
        }
    };

    public static Comparator<CityPopulation> CityPopulationComparator2 = new Comparator<CityPopulation>() {
        public int compare (CityPopulation c1, CityPopulation c2) {
            return (c2.getCityCitizensPopulation()) - (c1.getCityCitizensPopulation());
        }
    };
}
