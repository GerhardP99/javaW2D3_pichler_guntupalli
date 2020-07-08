package sinduri.ArrayLists;

public class City {
    String cityName;
    Integer temperatureCity;

    public City(String cityName, Integer temperatureCity) {
        this.cityName = cityName;
        this.temperatureCity = temperatureCity;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getTemperatureCity() {
        return temperatureCity;
    }

    public void setTemperatureCity(Integer temperatureCity) {
        this.temperatureCity = temperatureCity;
    }
}
