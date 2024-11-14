/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.insertvars;

/**
 *
 * @author Tesla Laptops
 */

import java.util.Arrays;
import java.util.Scanner;

public class Insertvars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] LA = {12, 23, 34, 45, 56};
        
        System.out.println("Initial Array: " + Arrays.toString(LA));
        System.out.print("Enter index K where you want to insert: ");
        int K = sc.nextInt();
        
        System.out.print("Enter a positive integer ITEM to insert: ");
        int ITEM = sc.nextInt();
      
        LA = insert(LA, K, ITEM);
        
        System.out.println("Final Array: " + Arrays.toString(LA));
    }
  
    public static int[] insert(int[] LA, int K, int ITEM) {
        if (K < 0 || K >= LA.length) {
            System.out.println("Error: Index K is out of range.");
            return LA;
        }

        if (ITEM <= 0) {
            System.out.println("Error: ITEM must be a positive integer.");
            return LA;
        }
    
        if (ITEM < LA[K]) {
     
            int[] newArray = new int[LA.length + 1];
            
          
            for (int i = 0; i < K; i++) {
                newArray[i] = LA[i];
            }
      
            newArray[K] = ITEM;
            
         
            for (int i = K ; i < LA.length; i++) {
                newArray[i + 1] = LA[i];
            }
            
            System.out.println("Inserted " + ITEM + " at index " + K);
            return newArray;
        } else {
            System.out.println(LA[K] + " at index " + K + " is greater than user's entered " + ITEM);
            return LA; 
        }
    }
}

    


