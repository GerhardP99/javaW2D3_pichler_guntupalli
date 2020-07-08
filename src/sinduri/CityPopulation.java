package sinduri;

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
}
