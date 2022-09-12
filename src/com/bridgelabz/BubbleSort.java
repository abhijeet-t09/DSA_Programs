package com.bridgelabz;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - 1); j++) {

                if (array[j - 1] > array[j]) {

                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] array = { 12, 2, 4, 54, 23,21, 67, 34, 48, 64 };
        System.out.println("Array before Sorting: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();

        bubbleSort(array);
        System.out.println("\nArray after Sorting: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}