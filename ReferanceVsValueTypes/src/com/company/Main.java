package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            int myIntValue = 10;
            int anotherIntValue = myIntValue;

            System.out.println("my Int value = " + myIntValue);
        System.out.println("AnotherIntValue is = " + anotherIntValue);

        anotherIntValue++;

            System.out.println("my Int value = " + myIntValue);
        System.out.println("AnotherIntValue is = " + anotherIntValue);
        //
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("AnotherIntArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("myIntArray after change = " + Arrays.toString(myIntArray));
        System.out.println("AnotherIntArray = " + Arrays.toString(anotherArray));

        anotherArray =new int[] {3,4,5,6,7};
        modifyArray(myIntArray);

        System.out.println("myIntArray after modify = " + Arrays.toString(myIntArray));
        System.out.println("AnotherIntArray = " + Arrays.toString(anotherArray));
    }
    private static void modifyArray (int[] array){
        array[0] = 2;
        array = new int[]{1,2,3,4,5};

    }
}
