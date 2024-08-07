package com.exercises;

import java.util.Scanner;



public class Exercises1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();

        // Initialize the array
        int[] array = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Print the array elements in reverse order
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(" ");
            }

        }
    }
}