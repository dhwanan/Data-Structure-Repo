package com.dkss;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        int[] myIntegers = getIntegers(6);
        int[] sorted = sortIntegers(myIntegers);
        printarray(sorted);

    }


    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + "Integers numbers.\r");

        for(int i=0;i<array.length;i++)
        {
            array[i] = scanner.nextInt();
        }


        return array;
    }

    public static void printarray(int[] array)
    {
        for(int i=0; i<array.length;i++)
        {
            System.out.println("Element "+i+"contents "+ array[i]);
        }
    }


    public static int[] sortIntegers(int[] array)
    {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag= true;
        int temp;
        while(flag)
        {
            flag= true;   

            for(int i=0;i<sortedArray.length-1;i++)
            {
                if(sortedArray[i]>sortedArray[i+1]){

                    temp = sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}
