package com.fstk1337.bot.weather;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class GeoObject {
    private GeoDistrict district;
    private GeoLocality locality;
    private GeoProvince province;
    private GeoCountry country;
}
