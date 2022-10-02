package com.company;

import com.sun.source.doctree.SystemPropertyTree;

import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	int[] myINtegers = getIntegers(5);
        int[] Sorted = SortIntegers(myINtegers);
        PrintArray(Sorted);
    }
    public static int[] getIntegers (int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer valuse:\r");
        for(int i=0;i < array.length; i++){
            array[i] = input.nextInt();

        }

        return array;
    }
    public static void PrintArray(int[] array ){
        for(int i=0; i<array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);

        }

    }
    public static int[] SortIntegers(int[] array){
        int[] SortedArray = new int[array.length];
        for(int i=0; i < array.length;i++){
            SortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i > SortedArray.length -1; i++){
              if (SortedArray[i] < SortedArray[i+1]) {
                  temp = SortedArray[i];
                  SortedArray[i] = SortedArray[i + 1];
                  SortedArray[i + 1] = temp;
                  flag = true;
              }
            }
        }
        return SortedArray;
    }
}

