package com.company;

public class Main {

    public static void main(String[] args) {
        chapter6();
    }

    public static void chapter6() {
        q1();
    }

    public static void q1() {
        /*
        Write a program that initializes an array with ten random integers and then prints four lines of output, containing
        • Every element at an even index.
        • Every even element.
        • All elements in reverse order.
        • Only the first and last element.
        */

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i = 0; i < 10; i++)
        {
            if(i%2 == 0)
            {
                System.out.print(array[i]);
            }
        }

        System.out.println("");

        for(int i = 0; i < 10; i++)
        {
            if(array[i] % 2 == 0)
            {
                System.out.print(array[i]);
            }
        }

        System.out.println("");

        for(int i = array.length - 1; i > -1; i--)
        {
            System.out.print(array[i]);
        }

        System.out.println("");
        System.out.print(array[0]);
        System.out.print(array[array.length - 1]);
    }
}
