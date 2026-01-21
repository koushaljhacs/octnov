package programming.algorithm.mergesort;

import java.util.Scanner;

public class implementation {
    public static void mergeTwoSortedArray(int[] arr, int[] brr, int[] crr) {
        int i=0, j=0, k=0;
        while(i < arr.length && j < brr.length) {
            if(arr[i] <= brr[j]) {
                crr[k++] = arr[i++];
            } else {
                crr[k++] = brr[j++];
            }
        }

        while(j == brr.length && i < arr.length) {
            crr[k++] = arr[i++];
        }
        while(i == arr.length && j < brr.length) {
            crr[k++] = brr[j++];
        }
    }
    public static void printArray(int[] arr) {
        for(int ele: arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void mergeSort(int[] arr) {
        if(arr.length <= 1) return;
        int[] a = new int[arr.length/2];
        for(int i=0; i<a.length; i++) {
            a[i] = arr[i];
        }
        int[] b = new int[arr.length - arr.length/2];
        for(int j=a.length; j<arr.length; j++){
            b[j-a.length] = arr[j];
        }
        mergeSort(a);
        mergeSort(b);
        mergeTwoSortedArray(a, b, arr);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = obj.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++) {
            arr[i] = obj.nextInt();
        }

        mergeSort(arr);
        printArray(arr);
    }
}
