package com.fstk1337.bot.weather;

import com.fstk1337.bot.util.PropertiesLoader;

public record WeatherRequest(double latitude, double longitude, String language) {
    private static final String BASE_URL = PropertiesLoader.getProperty("yandex.weather.api.base.url");
    private static final String API_KEY = PropertiesLoader.getProperty("yandex.weather.api.token");

    public String getRequestUrl() {
        String format = "%s?lat=%f&lon=%f&lang=%s";
        return String.format(format, BASE_URL, latitude, longitude, language);
    }

    public String getApiKey() {
        return API_KEY;
    }
}
