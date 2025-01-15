/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bubblesort;

/**
 *
 * @author Tesla Laptops
 */
import java.io.*;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {67, 44, 82, 17, 20}; // Initialize an array

        // Display array before sorting
        System.out.print("Array before Sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Bubble Sort algorithm
        for (int i = 0; i < n - 1; i++) { // Loop from 0 to n-1
            boolean swapped = false; // Flag to detect if any swaps occurred

            // Traverse the unsorted part
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // If current item is bigger than the next
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true; // Mark swapped as true
                }
            }

            // If no swaps occurred, array is already sorted
            if (!swapped) {
                break;
            }
        }

        // Display array after sorting
        System.out.print("Array After Sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


