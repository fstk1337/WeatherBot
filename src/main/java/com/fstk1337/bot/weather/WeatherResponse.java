package com.fstk1337.bot.weather;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class WeatherResponse {
    private long now;
    private String now_dt;
    private WeatherInfo info;
    private GeoObject geo_object;
    private Yesterday yesterday;
    private WeatherFact fact;
    @JsonIgnore
    private WeatherForecast forecasts;
}
