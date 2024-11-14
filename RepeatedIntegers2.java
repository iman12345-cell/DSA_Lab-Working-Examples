/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.insertvars;

/**
 *
 * @author Tesla Laptops
 */
    
import java.util.HashMap;
import java.util.HashSet;
public class RepeatedIntegers2 {
    
    public static void main(String[] args) {
        int[] B = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5}; // Example array
        int[] repeated = findRepeated(B);
        System.out.println("Repeated integers: ");
        for (int num : repeated) {
            System.out.print(num + " ");
        }
    }

    public static int[] findRepeated(int[] B) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        HashSet<Integer> repeatedSet = new HashSet<>();
        
        for (int num : B) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) == 2) { // We only want to add it when it is repeated
                repeatedSet.add(num);
            }
        }

        // Convert the set to an array
        int[] repeated = new int[repeatedSet.size()];
        int index = 0;
        for (int num : repeatedSet) {
            repeated[index++] = num;
        }
        
        return repeated;
    }
}
