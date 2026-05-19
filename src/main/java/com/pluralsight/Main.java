package com.pluralsight;

import java.time.LocalDate;

public class Main
{
    static void main()
    {
        FixedList<Integer> numbers = new FixedList<>(3);

        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43); // this line should fail

        System.out.println();
        System.out.println(numbers.getItems().size());
        System.out.println(numbers.getItems());



        FixedList<LocalDate> dates = new FixedList<>(2);

        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
//      dates.add(15); // this line should fail (it's an int and goes over the limit)

        System.out.println();
        System.out.println(dates.getItems().size());
        System.out.println(dates.getItems());



        FixedList<String> strings = new FixedList<>(6);

        strings.add("Hello");
        strings.add("peepee poopoo");
        strings.add("57557");
        strings.add("www.google.com");
        strings.add("0-0-4");
        strings.add("skibidi");
        strings.add("guh"); // this line should also fail

        System.out.println();
        System.out.println(strings.getItems().size());
        System.out.println(strings.getItems());
    }
}
