package com.fstk1337.bot.weather;

import lombok.RequiredArgsConstructor;

import java.net.URI;
import java.net.URISyntaxException;

@RequiredArgsConstructor
public class WeatherRequest {
    private static final String BASE_URL = WeatherProperties.getBaseUrl();
    private static final String HEADER_NAME = WeatherProperties.getHeaderName();
    private static final String API_KEY = WeatherProperties.getToken();
    private final double latitude;
    private final double longitude;
    private final String language;

    public URI getRequestUri() {
        String format = "%s?lat=%f&lon=%f&lang=%s";
        try {
            return new URI(String.format(format, BASE_URL, latitude, longitude, language));
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public String getHeaderName() {
        return HEADER_NAME;
    }

    public String getApiKey() {
        return API_KEY;
    }
}
