package GCD;

public class Main {
    public static void main(String[] args) {

    }
    // Create method!
    public static int getGCD(int numberOne, int numberTwo){
        if (numberOne == 0) return numberTwo;
        if (numberTwo == 0) return numberOne;
        if (numberOne >= numberTwo) return getGCD(numberOne % numberTwo, numberTwo);
        return getGCD(numberOne, numberTwo % numberOne);
    }
}
