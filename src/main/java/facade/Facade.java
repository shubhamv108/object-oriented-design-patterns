package facade;

interface ExternalWeatherAPI {

    String getTemperature(String city);
    String getLocation(String city);

}

class WeatherInfo {
    private final String temperature;
    private final String location;

    public WeatherInfo(final String temperature, final String location) {
        this.temperature = temperature;
        this.location = location;
    }
}

class WeatherFacade {

    private final ExternalWeatherAPI weatherAPI;

    public WeatherFacade(final ExternalWeatherAPI weatherAPI) {
        this.weatherAPI = weatherAPI;
    }

    public WeatherInfo getWeather(String city) {
        final String temperature = this.weatherAPI.getTemperature(city);
        final String location = this.weatherAPI.getLocation(city);
        return new WeatherInfo(temperature, location);
    }

}
