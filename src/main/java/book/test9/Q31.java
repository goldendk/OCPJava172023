package book.test9;

import java.time.*;

public class Q31 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2022, 06, 02, 6, 0, 0);  //Jun 2nd, 6AM.
        ZoneOffset nyOffset = ZoneOffset.ofHoursMinutes(-5, 0);
        ZoneId nyZone = ZoneId.of("America/New_York");
        OffsetDateTime nyOdt = ldt.atOffset(nyOffset);
        ZonedDateTime nyZdt = ldt.atZone(nyZone);
        Duration d = Duration.between( nyOdt, nyZdt);
        System.out.println(d);
    }
}
