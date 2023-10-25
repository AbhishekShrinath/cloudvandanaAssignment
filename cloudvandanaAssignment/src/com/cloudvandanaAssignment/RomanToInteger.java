package com.cloudvandanaAssignment;

import java.util.Scanner;

public class RomanToInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Number: ");
        String roman = scanner.nextLine();

        if (isRomanNumeral(roman)) {
            int result = romanToInteger(roman);
            System.out.println("Integer Value: " + result);
        } else {
            System.out.println("Invalid Roman Numeral.");
        }
    }

    public static int romanToInteger(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value = romanCharToInt(c);

            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            prevValue = value;
        }

        return result;
    }

    public static boolean isRomanNumeral(String s) {
        // Regular expression to check if the input is a valid Roman numeral.
        return s.matches("^(M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3}))$");
    }

    public static int romanCharToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0; // Invalid character
        }
    }
}
