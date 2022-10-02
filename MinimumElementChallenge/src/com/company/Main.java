package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] MyIntArray = new int[5];
        readIntegers(MyIntArray);
        findMin(MyIntArray);
    }
    private static void readIntegers(int[] array){
        int numberInput = array.length;

        for (int i = 0; i < array.length; i++ ) {
            System.out.println("your will need to enter " + numberInput + " numbers");
                array[i] = scanner.nextInt();
                numberInput--;
        }
    }
    private static void findMin (int[] array){
        int MinimumNumber;
        MinimumNumber = array[0];
        for(int i = 0; i < array.length ; i++){

            if(array[i]< MinimumNumber) {
                MinimumNumber = array[i];
            }


        }
        System.out.println("Minimum number is " + MinimumNumber);













    }
}
