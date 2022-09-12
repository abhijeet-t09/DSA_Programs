package com.bridgelabz;
import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        InsertionSort insert = new InsertionSort();

        String[] array = { "Apple", "Orange", "Mango", "Banana", "Peach" };
        System.out.print("Original Array: [");
        for(int i = 0; i < (array.length); i++){
            if((i < (array.length - 1))){
                System.out.print(array[i] + ", ");
            }
            else
                System.out.println(array[i] + "]");
        }

        insert.insertionSort(array);

        System.out.print("\nSorted Array : ");
        System.out.print(Arrays.toString(array));

    }

    public void insertionSort(String[] array) {

        for (int i = 1; i < (array.length - 1); i++) {
            String str = array[i+1];

            while (i>=0 && ((str.compareTo(array[i])) < 0)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = str;
        }
    }
}
