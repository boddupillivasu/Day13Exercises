package com.exercises;
import java.util.Scanner;



// Define the AdvancedArithmetic interface
        interface AdvancedArithmetic {
            int divisorSum(int n);
        }

// Implement the Calculator class which implements AdvancedArithmetic
        class Calculator implements AdvancedArithmetic {
            // Implement the divisorSum method
            public int divisorSum(int n) {
                int sum = 0;
                // Loop to find divisors and add them to the sum
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        sum += i;
                    }
                }
                return sum;
            }
        }

        public class Exercise2 {
            public static void main(String[] args) {
                // Create a Scanner object for input
                Scanner scanner = new Scanner(System.in);

                // Read the input integer
                int n = scanner.nextInt();

                // Close the scanner
                scanner.close();

                // Create a Calculator object
                AdvancedArithmetic myCalculator = new Calculator();


                int sum = myCalculator.divisorSum(n);

                
                System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
                System.out.println(sum);
}
        }



