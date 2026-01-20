import java.util.*;
public class test {
    public static void mergeSortedArray(int[] arr, int[] brr, int[]) {
        int[] crr = new int[arr.length + brr.length];
        int i=0, j=0, k=0;
        while(i < arr.length && j < brr.length) {
            if(arr[i] < brr[j]) {
                crr[k++] = arr[i++];
            } else {
                crr[k++] = brr[j++];
            }
        }
        while(i==arr.length && j < brr.length) {
            crr[k++] = brr[j++];
        }
        while(j==brr.length && i < arr.length) {
            crr[k++] = arr[i++];
        }
    }
    public static void mergeSortAlgorithm(int[] arr) {
        if( arr.length == 1 ) {
            return;
        }
        int length = arr.length;
        int[] a = new int[length/2];
        int[] b = new int[length - length/2];
        mergeSortAlgorithm(a);
        mergeSortAlgorithm(b);
        mergeSortedArray(a,b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = scanner.nextInt();
        }

        mergeSortAlgorithm(arr);
        printArray(arr);
    }
    public static void printArray(int[] array) {
        for(int element : array) {
            System.out.print(element + " ");
        }
    }
}
