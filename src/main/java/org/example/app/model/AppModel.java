package org.example.app.model;

import net.time4j.ClockUnit;
import net.time4j.Duration;

public class AppModel {

    public String convertSecondInFormat(long second, String format){
        Duration<ClockUnit> duration = Duration.of(second, ClockUnit.SECONDS)
                .with(Duration.STD_CLOCK_PERIOD);
        return Duration.Formatter.ofPattern(ClockUnit.class, format)
                .format(duration);
    }

}
