package com.fstk1337.bot.http;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fstk1337.bot.weather.WeatherRequest;
import com.fstk1337.bot.weather.WeatherResponse;
import lombok.RequiredArgsConstructor;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.function.Supplier;

@RequiredArgsConstructor
public class HttpWeatherRequest {
    private final WeatherRequest weatherRequest;
    private static final ObjectMapper om = JsonMapper.builder().build();

    public WeatherResponse getWeather() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(weatherRequest.getRequestUri())
                .header("Accept", "application/json")
                .header(weatherRequest.getHeaderName(), weatherRequest.getApiKey())
                .build();
        HttpResponse<Supplier<WeatherResponse>> response = client.send(request,
            new HttpResponse.BodyHandler<Supplier<WeatherResponse>>() {
                @Override
                public HttpResponse.BodySubscriber<Supplier<WeatherResponse>> apply(HttpResponse.ResponseInfo responseInfo) {
                    return asJSON(WeatherResponse.class);
                }

                public static <WeatherResponse> HttpResponse.BodySubscriber<Supplier<WeatherResponse>> asJSON(Class<WeatherResponse> type) {
                    HttpResponse.BodySubscriber<InputStream> upstream = HttpResponse.BodySubscribers.ofInputStream();

                    return HttpResponse.BodySubscribers.mapping(
                            upstream,
                            inputStream -> toSupplierOfType(inputStream, type));
                }

                public static <WeatherResponse> Supplier<WeatherResponse> toSupplierOfType(InputStream inputStream, Class<WeatherResponse> type) {
                    return () -> {
                        try (InputStream stream = inputStream) {
                            return om.readValue(stream, type);
                        } catch (IOException e) {
                            throw new UncheckedIOException(e);
                        }
                    };
                }
            }
        );
        return response.body().get();
    }
}
