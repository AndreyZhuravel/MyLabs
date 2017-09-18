package com.andreyhome;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[]{17, 13, 5, 84, 19, 10, 15, 21, 19, 54};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        int searchVal = 14;
        int retval = Arrays.binarySearch(a,searchVal);
        System.out.println("Index of Elements 39 is:" + retval);
    }

}
