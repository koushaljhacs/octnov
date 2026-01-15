package leetcode;

import java.util.Scanner;

public class Q268 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = obj.nextInt();
                                   // 1 3 5 6 7 8       AIOBE
        int[] arr = new int[size]; // 1 3 4 5 6 7       AIOBE
                                   // 0 1 3 4 5 6

                                     
        for(int i=0; i<size; i++) {
            arr[i] = obj.nextInt();
        }

        boolean[] b = new boolean[size+10];  // F T F T T T 6 T
                                            //   0 1 2 3 4 5 6 7
                                               
        // Marking
        for(int ele: arr) {
            b[ele] = true;
        }        
        for(int i=0; i<b.length; i++) {
            if(b[i] == false) {
               System.out.print(i + " ");
            }
        }

        obj.close();
    }
}
