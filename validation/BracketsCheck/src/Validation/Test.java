package Validation;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        String stringRegex;
        String java;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Print line with brackets: ");
        for (; ; ) {

            stringRegex = scanner.nextLine();
            if (stringRegex.equals("exit")) {
                System.out.println("goodbye!");
                break;
            }

            java = stringRegex.replaceAll("[^(){}\\[\\]]", "");
            System.out.println(getValid(java));

            System.out.println("Enter 'exit' to close the program\nor enter a new line: ");

        }
    }

    static boolean getValid(String string) {
        if (string.isEmpty()) return false;

        Stack<Character> stackBrackets = new Stack<>();
        Map<Character, Character> mapBrackets = new HashMap<>();

        mapBrackets.put(']', '[');
        mapBrackets.put('}', '{');
        mapBrackets.put(')', '(');

        char stringToChar;
        boolean checkKey, checkValue;

        for (int i = 0; i < string.length(); i++) {

            stringToChar = string.charAt(i);
            checkKey = mapBrackets.containsKey(stringToChar);
            checkValue = mapBrackets.containsValue(stringToChar);

            if (checkValue) stackBrackets.push(stringToChar);

            if (checkKey) {
                try {
                    if (mapBrackets.get(stringToChar).equals(stackBrackets.peek())) {
                        stackBrackets.pop();
                    } else return false;
                } catch (EmptyStackException ex) {
                    return false;
                }
            }
        }
        return stackBrackets.empty();
    }
}
