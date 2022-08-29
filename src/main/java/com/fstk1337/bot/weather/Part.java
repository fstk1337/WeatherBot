package com.fstk1337.bot.weather;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Part {
    private String part_name;
    private int temp_min;
    private int temp_max;
    private int temp_avg;
    private int feels_like;
    private String icon;
    private String condition;
    private String daytime;
    private boolean polar;
    private double wind_speed;
    private int wind_gust;
    private String wind_dir;
    private int pressure_mm;
    private int pressure_pa;
    private int humidity;
    private int prec_mm;
    private int prec_period;
    private int prec_prob;
}
