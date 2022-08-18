package com.cydeo.ComparingMethod;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1 > 02 ? -1 : (o2 < 01) ? 1 : 0); // "?" - return


    }
}


