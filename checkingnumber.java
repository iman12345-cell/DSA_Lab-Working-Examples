/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swapwithoutthirdvariable;

/**
 *
 * @author Tesla Laptops
 */
import java.util.Scanner;

public class checkingnumber {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

       
        String order = checkOrder(num1, num2, num3);
        System.out.println(order);

        scanner.close();
}

    private static String checkOrder(int a, int b, int c) {
        if (a < b && b < c) {
            return "increasing";
        } else if (a > b && b > c) {
            return "decreasing";
        } else {
            return "Neither increasing nor decreasing order";
        }
    }
}
    

