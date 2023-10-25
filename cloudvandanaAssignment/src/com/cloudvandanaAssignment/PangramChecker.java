package com.cloudvandanaAssignment;

import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        
        if (isPangram(input.toLowerCase())) {
            System.out.println("The input is a Pangram.");
        } else {
            System.out.println("The input is not a Pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        boolean[] alphabetCheck = new boolean[26];
        int totalAlphabets = 26;

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if ('a' <= c && c <= 'z') {
                int index = c - 'a';
                if (!alphabetCheck[index]) {
                    alphabetCheck[index] = true;
                    totalAlphabets--;
                }

                if (totalAlphabets == 0) {
                    return true; 
                }
            }
        }
        
        return false; 
    }
}
