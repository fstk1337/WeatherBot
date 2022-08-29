package com.fstk1337.bot.weather;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class WeatherFact {
    private long obs_time;
    private long uptime;
    private int temp;
    private int feels_like;
    private int temp_water;
    private String icon;
    private String condition;
    private int cloudness;
    private int prec_type;
    private int prec_prob;
    private int prec_strength;
    @JsonProperty("is_thunder")
    private boolean is_thunder;
    private double wind_speed;
    private String wind_dir;
    private int pressure_mm;
    private int pressure_pa;
    private int humidity;
    private String daytime;
    private boolean polar;
    private String season;
    private String source;
    private double soil_moisture;
    private int soil_temp;
    private int uv_index;
    private double wind_gust;
}
