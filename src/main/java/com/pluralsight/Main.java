package com.pluralsight;

public class Main
{
    static void main()
    {
        FixedList<Integer> numbers = new FixedList<>(3);

        numbers.add(10);

        numbers.add(3);

        numbers.add(92);

        numbers.add(43); // this line should fail

        System.out.println(numbers.getItems().size());
        System.out.println(numbers.getItems());
    }
}
