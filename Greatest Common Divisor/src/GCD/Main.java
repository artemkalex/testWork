package GCD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test method
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        // Check compilation time
        long start = System.currentTimeMillis();
        System.out.println(getGCD(numberOne, numberTwo));
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms");
    }

    // Create method!
    public static int getGCD(int numberOne, int numberTwo) {
        if (numberOne == 0) return numberTwo;
        if (numberTwo == 0) return numberOne;
        if (numberOne >= numberTwo) return getGCD(numberOne % numberTwo, numberTwo);
        return getGCD(numberOne, numberTwo % numberOne);
    }
}
