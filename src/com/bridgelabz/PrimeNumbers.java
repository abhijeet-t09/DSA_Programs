package com.bridgelabz;

public class PrimeNumbers {
    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        int limit = 1000;

        for (int i = 0; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }

        }
    }
}
