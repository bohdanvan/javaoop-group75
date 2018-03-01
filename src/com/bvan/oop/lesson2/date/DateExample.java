package com.bvan.oop.lesson2.date;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author bvanchuhov
 */
public class DateExample {

    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        System.out.println(ld1);

        LocalDate ld2 = LocalDate.of(1950, 10, 17);
        System.out.println(ld2);

        LocalDate ld3 = LocalDate.parse("2000-04-03");
        System.out.println(ld3);

        DayOfWeek dayOfWeek = ld2.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek.getValue());

//        LocalTime
//        LocalDateTime
    }

}
