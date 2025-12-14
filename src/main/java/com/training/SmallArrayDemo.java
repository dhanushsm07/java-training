package com.training;

public class SmallArrayDemo {
    public static void main(String[] args) {

        // One-dimensional array
        int[] numbers = {10, 20, 30};

        System.out.println("1D Array Elements:");
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        // Multidimensional (2D) array
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };

        System.out.println("\n2D Array Elements:");
        System.out.println(matrix[0][0] + " " + matrix[0][1]);
        System.out.println(matrix[1][0] + " " + matrix[1][1]);
    }
}
