package GCD;

import java.util.Scanner;

import static GCD.GCD.getGCD;

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
}
