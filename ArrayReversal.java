/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ai231045;

/**
 *
 * @author 123
 */
public class ArrayReversal {
    public static void main(String[] args) {
      
        int[] array = {1, 2, 3, 4, 5};

      
        System.out.println("Original Array:");
        printArray(array, 0);

       
        reverseArray(array, 0, array.length - 1);

      
        System.out.println("Reversed Array:");
        printArray(array, 0);
    }

  
    public static void reverseArray(int[] array, int start, int end) {
        
        if (start >= end) {
            return;
        }

     
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;

   
        reverseArray(array, start + 1, end - 1);
    }

  
    public static void printArray(int[] array, int index) {
       
        if (index >= array.length) {
            return;
        }

        
        System.out.print(array[index] + " ");

   
        printArray(array, index + 1);
    }
}