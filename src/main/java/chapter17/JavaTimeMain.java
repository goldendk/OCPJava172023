package chapter17;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class JavaTimeMain {
    public static void main(String... args) {
        runPeriod();
        runDuration();
        runDateTime();
        runLocalDate();
        runLocalTime();
        runLocalDateTime();
        runOffsetDateTime();
        foo();
    }

    private static void runLocalDateTime() {

    }

    private static void runPeriod() {

        Period period = Period.ofDays(52);
        System.out.println(period);
        period = period.withMonths(1);
        System.out.println(period);
        System.out.println(period.normalized());
        System.out.println(period);
        period = period.withMonths(14);
        System.out.println(period.normalized());
        System.out.println("months: " + period.toTotalMonths());

    }

    private static void runDuration() {
        System.out.println("---------------Duration-----------------");
        Duration d = Duration.parse("PT1H2M3S");
        System.out.println(d);
        d = d.plus(100, ChronoUnit.SECONDS);
        System.out.println(d);
        System.out.println("in days: " + d.toDays());
        System.out.println("in seconds: " + d.toSeconds());
        System.out.println("in secondsPart: " + d.toSecondsPart());
        System.out.println(d.abs());
    }

    private static void runDateTime() {
        System.out.println("-------------DateTime--------------------");
        LocalDateTime dt = LocalDateTime.of(2023, 1, 20, 23, 13, 53);
        System.out.println(dt);
        dt = dt.withHour(22);
        System.out.println(dt);
    }

    private static void runLocalDate() {
        System.out.println("------------LocalDate----------------");
        LocalDate parse = LocalDate.parse("2023-12-29");
        System.out.println(parse);
        parse = parse.withMonth(11);
        System.out.println(parse);
        System.out.println(parse.range(ChronoField.DAY_OF_MONTH));
        LocalDate of = LocalDate.of(2021, 1, 1);
        of = of.withDayOfMonth(31).withMonth(2);
        System.out.println(of.minusMonths(1));
        LocalDate p2D = of.plus(Period.parse("P2D"));

    }

    private static void runLocalTime() {
        System.out.println("-------------LocalTime----------");
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        lt = lt.plusHours(23);
        System.out.println(lt);
    }

    private static void runOffsetDateTime() {
        System.out.println("-------------OffsetDateTime------------");
        OffsetDateTime odt = OffsetDateTime.ofInstant(Instant.now(), ZoneId.of("Europe/Copenhagen"));
        System.out.println(odt);

        System.out.println("offsettime: " + odt.toOffsetTime());

        ZonedDateTime zdt = odt.atZoneSameInstant(ZoneId.of("Europe/London"));

        System.out.println("Zoned date time: " + zdt);

    }

    public static void foo() {
        Duration pt24H = Duration.parse("PT24H");
       //localdate cannot except temporal values that contains seconds, minutes, hours etc.
        //LocalDate plus = LocalDate.of(2021, 4, 1).plus(pt24H);
        //System.out.println(plus);

        Duration between = Duration.between(LocalTime.of(17, 30), LocalDateTime.of(2021, Month.APRIL, 2, 15, 15));
        System.out.println(between);

        //will not run as the compare() method of the localtime called from localdatetime cannot find dates or any local date fields.
        // Duration between2 = Duration.between(LocalDateTime.of(2021, Month.APRIL, 2, 15, 15), LocalTime.of(17, 30));
       // System.out.println(between2);
    }
}
