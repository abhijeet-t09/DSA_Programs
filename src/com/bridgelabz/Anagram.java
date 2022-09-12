package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean checkAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        if (str1.length() != str2.length()) {
            return false;
        }else {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String str1, str2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first String: ");
        str1 = scanner.nextLine().toLowerCase();
        System.out.print("Enter second String: ");
        str2 = scanner.next().toLowerCase();

        boolean res = checkAnagram(str1, str2);
        if(res) {
            System.out.println(str1 + " and " + str2 + " are anagrams");
        }else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }

    }
}
