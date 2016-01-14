package kops.weather;


public class Forecast {

    private Temp temp;
    private Weather[] weather;

    public Temp getTemp() {
        return this.temp;
    }

    public Weather[] getWeather() {
        return this.weather;
    }
}
