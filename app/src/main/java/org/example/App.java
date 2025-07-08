package org.example;

public class App {
    public static void main(String[] args) {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();

        System.out.println("T1 = " + calculator.value(1));  // 1
        System.out.println("T2 = " + calculator.value(2));  // 3
        System.out.println("T4 = " + calculator.value(4));  // 10

        System.out.println("Add(2, 3) = " + calculator.add(2, 3));       // 3 + 6 = 9
        System.out.println("Subtract(4, 2) = " + calculator.subtract(4, 2)); // 10 - 3 = 7
        System.out.println("Multiply(2, 3) = " + calculator.multiply(2, 3)); // 3 * 6 = 18
    }
}
