/* Author: OctNov Team
 * contact: koushaljha.cs@gmail.com
 * whatsapp: +91 8298163299
 * Member: Hitanshu Dhakrey | Shivanshu Dhakrey | Chandrashekhar Bansal
 * University: GLA UNIVERSITY, MATHURA



/**
 * Algorithm Steps:
 * 1. Define the search space by setting two pointers: 'low' at index 0 and 'high' at the last index.
 * 2. Enter a loop that continues as long as the search space is valid (low <= high).
 * 3. Calculate the middle index using the overflow-safe formula: low + (high - low) / 2.
 * 4. Check the middle element:
 *      - If it matches the target, return the index immediately.
 *      - If it is smaller than the target, discard the left half by moving 'low' to 'mid + 1'.
 *      - If it is larger than the target, discard the right half by moving 'high' to 'mid - 1'.
 * 5. If the loop ends without finding the target, return a distinct value (e.g., -1) to indicate failure.
 */

package programming.algorithm.linearsearch;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
class Implementation {

    public static int linearSearch(List<Integer> arr, int target) {
        
        for(int i=0; i<arr.size(); i++) {
            if(arr.get(i) == target) {
                return i;
            }
        }
        // Return -1 to indicate element not found (0 is a valid index, so avoiding it for failure)
        return -1; 
    }

    // Helper method to split input string into a list of words safely
    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter numbers separated by space:");
        // Converts input line -> String Array -> Stream -> Integer List
        List<Integer> arr = splitWords(obj.nextLine())
                                .stream()
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        System.out.print("Enter target element: ");
        int target = Integer.parseInt(obj.nextLine());
        
        obj.close();

        int res = linearSearch(arr, target);
        
        if (res != -1) {
            System.out.println("Element found at index: " + res);
        } else {
            System.out.println("Element not found.");
        }
    }
}
