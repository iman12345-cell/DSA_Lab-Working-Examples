/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ai231045;

/**
 *
 * @author 123
 */
public class MatrixAddition {
public static void main(String[] args) {
int[][] matrixA = {
{1, 2, 3},
{4, 5, 6},
{7, 8, 9}
};
int[][] matrixB = {
{9, 8, 7},
{6, 5, 4},
{3, 2, 1}
};
int[][] resultMatrix = new int[matrixA.length][matrixA[0].length];
 for (int i = 0; i < matrixA.length; i++) {
 for (int j = 0; j < matrixA[0].length; j++) {
 resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];}}
 System.out.println("Resultant Matrix after Addition:");
 for (int i = 0; i < resultMatrix.length; i++) {
 for (int j = 0; j < resultMatrix[0].length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();}}}
