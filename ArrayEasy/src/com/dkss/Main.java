package com.dkss;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int[] myInt= getInt(5);
        for (int i=0;i<myInt.length;i++)
        {
            System.out.println("Element is "+i+": value is "+ myInt[i]);
        }




    }

    public static int[] getInt(int number)
    {
        System.out.println("Enter integer number: \r");
        int[] values = new int[number];


        for(int i=0;i<values.length;i++)
        {
            values[i]=scanner.nextInt();
        }

        return values;
    }



}
