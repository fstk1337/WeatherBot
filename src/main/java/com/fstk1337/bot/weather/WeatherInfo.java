package com.fstk1337.bot.weather;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class WeatherInfo {
    private boolean n;
    private int geoid;
    private String url;
    private double lat;
    private double lon;
    private TzInfo tzinfo;
    private int def_pressure_mm;
    private int def_pressure_pa;
    private String slug;
    private int zoom;
    private boolean nr;
    private boolean ns;
    private boolean nsr;
    private boolean p;
    private boolean f;
    private boolean _h;
}
