package com.company;

public class Siruri {

    public static void main (String[]artg) {

        int[][] matrix1 = {{1, 2, 3}, {5, 6, 7}, {9, 0, 1}};
        int[][] matrix2 = {{4, 1, 6}, {2, 3, 5}, {7, 4, 3}};
        int[][] matrix3 = new int[3][3];

        matrix3[0][0] = matrix1[0][0] + matrix2[0][0];
        matrix3[0][1] = matrix1[0][1] + matrix2[0][1];
        matrix3[0][2] = matrix1[0][2] + matrix2[0][2];
        matrix3[1][0] = matrix1[1][0] + matrix2[1][0];
        matrix3[1][1] = matrix1[1][1] + matrix2[1][1];
        matrix3[1][2] = matrix1[1][2] + matrix2[1][2];
        matrix3[2][0] = matrix1[2][0] + matrix2[2][0];
        matrix3[2][1] = matrix1[2][1] + matrix2[2][1];
        matrix3[2][2] = matrix1[2][2] + matrix2[2][2];

        }
    }