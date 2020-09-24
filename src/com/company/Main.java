//Look Up: http://best-practice-software-engineering.ifs.tuwien.ac.at/patterns/factory.html
package com.company;

public class Main {

//    private Main() {
//    }

//    public static Main createMain() {
//        return new Main();
//    }

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        chapter6();
    }

    public static void chapter6() {
        q1();
        q2();
    }

    private static void q2() {
        /*
        * Write array methods that carry out the following tasks for an array of integers. For each method, provide a test program.
            a. Swap the first and last elements in the array.
            b. Shift all elements by one to the right and move the last element into the first
            position. For example, 1 4 9 16 25 would be transformed into 25 1 4 9 16.
            c. Replace all even elements with 0.
            d. Replace each element except the first and last by the larger of its two neighbors.
            programming exercises 307 e. Remove the middle element if the array length is odd, or the middle two
            elements if the length is even.
            f.  Move all even elements to the front, otherwise preserving the order of the elements.
            g. Return the second-largest element in the array.
            h. Return true if the array is currently sorted in increasing order.
            i.  Return true if the array contains two adjacent duplicate elements.
            j.  Return true if the array contains duplicate elements (which need not be adjacent).
        * */

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        q2SwapFirstAndLast(array);
        q2Shift1ToTheRight(array);
    }

    private static void q2Shift1ToTheRight(int[] array) {
        // Shift all elements by one to the right and move the last element into the first

        int last = array[array.length-1];
        for(int i = array.length-1; i >= 1; i--)
        {
            array[i] = array[i - 1];
        }

        array[0] = last;

        printArray(array, "Shift one to the right");
    }

    private static void q2SwapFirstAndLast(int[] array) {
        // Swap the first and last elements in the array.
        int first = array[0];
        int last = array[array.length-1];

        array[0] = last;
        array[array.length-1] = first;

        printArray(array, "Swap");

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

        System.out.println("\n");

        for(int i = array.length - 1; i > -1; i--)
        {
            System.out.print(array[i]);
        }

        System.out.print("\n" + array[0]);
        System.out.println(array[array.length - 1]);
    }

    private static void printArray(int[] array, String arrayName) {
        for (int i = 0; i <= array.length-1; i++)
        {
            System.out.println(arrayName + " Element [" + i + "]: " + array[i]);
        }
    }
}
