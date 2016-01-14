package kops.weather;


public class CurrentWeather {

    private Weather[] weather;
    private Main main;
    private String name;

    public String getName() {
        return name;
    }

    public double getMax() {
        return main.getMax();
    }

    public double getMin() {
        return main.getMin();
    }

    public double getTemp() {
        return main.getTemp();
    }

    public String getDescription() {
        return weather[0].getDescription();
    }
}
