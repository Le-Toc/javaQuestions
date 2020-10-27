//Look Up: http://best-practice-software-engineering.ifs.tuwien.ac.at/patterns/factory.html
package com.company;

import sun.awt.image.IntegerComponentRaster;

import java.util.ArrayList;
import java.util.Arrays;

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
        //q1();
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
            e. Remove the middle element if the array length is odd, or the middle two
            elements if the length is even.
            f.  Move all even elements to the front, otherwise preserving the order of the elements.
            g. Return the second-largest element in the array.
            h. Return true if the array is currently sorted in increasing order.
            i.  Return true if the array contains two adjacent duplicate elements.
            j.  Return true if the array contains duplicate elements (which need not be adjacent).
        * */

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        //q2ASwapFirstAndLast(array);
        //q2BShift1ToTheRight(array);
        //q2PartC(array);
        //q2PartD();
        q2PartE();
    }

    public static void q2PartE(){
        // Remove the middle element if the array length is odd, or the middle two elements if the length is even.

        //Using arrays
        int[] unevenLengthArray = {0, 1, 2, 3, 4, 5, 6, 7, 8,};
        removeMiddleElements(unevenLengthArray);

        int[] evenLengthArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        removeMiddleElements(evenLengthArray);

        //Using arraylists
        ArrayList<Integer> unevenArrayList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8));
        removeMiddleElementsWithArrayLists(unevenArrayList);

        ArrayList<Integer> evenArrayList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        removeMiddleElementsWithArrayLists(evenArrayList);
    }

    private static void removeMiddleElementsWithArrayLists(ArrayList<Integer> arrayList) {
        int elementsRemovals = 2; // Assuming array is even

        if(arrayList.size() % 2 != 0) //if arraylist is uneven only take one element
            elementsRemovals = 1;

        for (int i = 1; i <= elementsRemovals; i++)
            arrayList.remove(arrayList.size() / 2);

        System.out.println(arrayList.toString());
    }

    private static void removeMiddleElements(int[] array) {
        int[] newArray;
        if(array.length % 2 == 0)//even
        {
            int firstNoToRemove = (array.length / 2) -1;
            int secondNoToRemove = array.length / 2;
            newArray = new int[array.length - 2];
            int j = 0;

            //Iterate through the array
            for (int i = 0; i < array.length; i++)
            {
                // Check if the element should be added
                if(i != firstNoToRemove && i != secondNoToRemove)
                {
                    newArray[j] = array[i];
                    j++;
                }
            }
        }
        else//uneven
        {
            // Get the index of the element to be removed
            int noToRemove = array.length / 2;
            newArray = new int[array.length - 1];
            int j = 0;

            //Iterate through the array
            for (int i = 0; i < array.length; i++)
            {
                // Check if the element should be added
                if(i != noToRemove)
                {
                    newArray[j] = array[i];
                    j++;
                }
            }
        }

        //print the array
        printArray(newArray, "newArray");
    }

    private static void q2PartD() {
        // Replace each element except the first and last by the larger of its two neighbors.
        /*
        Array is =          {51, 36, 84, 16, 13, 93, 81, 21, 69, 58}
        Array should be =   {51, 84, 84, 84, 93, 93, 93, 93, 93, 58}
        * */
        int[] array = {51, 36, 84, 16, 13, 93, 81, 21, 69, 58};
        int left, right;
        for (int i = 1; i < array.length -1; i++)
        {
            left = array[i - 1];
            if (left > array[i])
                array[i] = left;

            right = array[i + 1];
            if (right > array[i])
                array[i] = right;
        }

        printArray(array);
    }

    private static void q2PartC(int[] array) {
        // Replace all even elements with 0.
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 == 0)
                array[i] = 0;

        printArray(array, "Replace even numbers with 0");
    }

    private static void q2BShift1ToTheRight(int[] array) {
        // Shift all elements by one to the right and move the last element into the first

        int last = array[array.length-1];
        for(int i = array.length-1; i >= 1; i--)
        {
            array[i] = array[i - 1];
        }

        array[0] = last;

        printArray(array, "Shift one to the right");
    }

    private static void q2ASwapFirstAndLast(int[] array) {
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

    private static void printArray(int[] array) {
        //System.out.println("Original Array: "
        //                           + Arrays.toString(arr));
        for (int i = 0; i <= array.length-1; i++)
        {
            System.out.println(" Element [" + i + "]: " + array[i]);
        }
    }

    private static void printArray(int[] array, String arrayName) {
        for (int i = 0; i <= array.length-1; i++)
        {
            System.out.println(arrayName + " Element [" + i + "]: " + array[i]);
        }
    }
}
