package com.fstk1337.bot.weather;

import com.fstk1337.bot.util.PropertiesLoader;

public class WeatherProperties {

    public static String getToken() {
        return PropertiesLoader.getProperty("yandex.weather.api.token");
    }

    public static String getBaseUrl() {
        return PropertiesLoader.getProperty("yandex.weather.api.base.url");
    }

    public static String getHeaderName() {
        return PropertiesLoader.getProperty("yandex.weather.api.header.name");
    }
}
