package leetcode;

import java.util.Scanner;

public class q88 {
    public static void mergeSortedArray(int[] arr, int[] brr) {
        int[] crr = new int[arr.length + brr.length];
        int i=0, j=0, k=0;
        while(i < arr.length && j < brr.length) {
            if(arr[i] < brr[j]) {
                crr[k] = arr[i];
                i++;
            } else {
                crr[k] = brr[j];
                j++;
            }
            k++;
        }

        // if arr exhausted it means brr some elements be reamining to fill in crr
        if(i == arr.length) {
            while(j < brr.length) {
                crr[k] = brr[j];
                k++;
                j++;
            }
        }

        if(j == brr.length) {
            while(i < arr.length) {
                crr[k] = arr[i];
                k++;
                i++;
            }
        }

        System.out.println("\nAfter Merging:");
        printArray(crr);
    }
    public static void printArray(int[] array) {
        for(int element: array) {
            System.out.print(element + " ");
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Entet size of the frist array: ");
        if(!obj.hasNextInt()) {
            System.out.println("Invalid input!. Please enter only integer.");
            obj.close();
            return;
        }
        int size1 = obj.nextInt();
        int[] arr = new int[size1];
        System.out.println("Enter" + size1 + " elements: ");
        for(int i=0; i<arr.length; i++) {
            if(obj.hasNextInt()) {
                arr[i] = obj.nextInt();
            }
        }

        System.out.print("Entet size of the second array: ");
        if(!obj.hasNextInt()) {
            System.out.println("Invalid input!. Please enter only integer.");
            obj.close();
            return;
        }
        int size2 = obj.nextInt();
        int[] brr = new int[size2];
        System.out.println("Enter" + size2 + " elements: ");
        for(int i=0; i<brr.length; i++) {
            if(obj.hasNextInt()) {
                brr[i] = obj.nextInt();
            }
        }

        System.out.println();
        printArray(arr);
        System.out.println();
        printArray(brr);
        mergeSortedArray(arr, brr);

    }
}
