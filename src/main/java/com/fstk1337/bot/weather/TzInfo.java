package com.fstk1337.bot.weather;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class TzInfo {
    private String name;
    private String abbr;
    private boolean dst;
    private long offset;
}
