package edu.vibatista.primeiroprojetospringboot.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component //@Service || @Repository
public class DateUtil {
    public String formatLocalDateTimeToDatabaseStyle(LocalDateTime localDateTime) {
        return DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss").format(localDateTime);
    }
}
