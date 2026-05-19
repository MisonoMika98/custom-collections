package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T>
{
    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize)
    {
        this.maxSize = 10;
        this.items = new ArrayList<T>();
    }

    public void add(T item)
    {
        items.add(item);
    }

    public void getItems()
    {

    }
}
