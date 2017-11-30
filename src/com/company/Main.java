package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Введите слово:");
        String word = sca.next();
        if (isPalindrome(word)) {
            System.out.println("Это слово является палиндромом");
        } else {
            System.out.println("Это слово не является палиндромом");
        }
    }

    public static boolean isPalindrome(String string) {
        boolean palindrome = false;
        String invertedWord = new String();
        for (int i = string.length(); i >= 0; i--) {
            invertedWord += string.charAt(i);
        }
        if (string.equals(invertedWord)) {
            palindrome = true;
        }
        return palindrome;
    }
}
