/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.swapwithoutthirdvariable;

/**
 *
 * @author Tesla Laptops
 */
class Swapwithoutthirdvariable {
    private int a;
    private int b;

    public Swapwithoutthirdvariable(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void swap() {
        a = a + b; // a now holds the sum of a and b
        b = a - b; // b is now the original value of a
        a = a - b; // a is now the original value of b
    }

    public void display() {
        System.out.println("a: " + a + ", b: " + b);
    }

    public static void main(String[] args) {
       Swapwithoutthirdvariable example = new Swapwithoutthirdvariable(5, 10);
        System.out.println("Before swapping:");
        example.display();

        example.swap();
        System.out.println("After swapping:");
        example.display();
    }
}
