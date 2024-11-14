/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.insertvars;

/**
 *
 * @author Tesla Laptops
 */
import java.util.HashSet;

public class Repeatingintegers1 {
    public static void main(String[] args) {
        int[] A = {1, 3, 4, 2, 2}; 
        System.out.println("Repeated integer: " + findRepeated(A));
    }

    public static int findRepeated(int[] A) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : A) {
            if (seen.contains(num)) {
                return num; 
            }
            seen.add(num);
        }
        return -1; 
    }
}