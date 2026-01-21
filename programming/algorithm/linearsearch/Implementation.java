/* Author: OctNov Team
 * contact: koushaljha.cs@gmail.com
 * whatsapp: +91 8298163299
 * Member: Hitanshu Dhakrey | Shivanshu Dhakrey | Chandrashekhar Bansal
 * University: GLA UNIVERSITY, MATHURA
 */

/**
 * Algorithm Steps (Linear Search):
 * 1. Start from the first element (index 0) of the list.
 * 2. Compare the current element with the 'target' value.
 * 3. If the current element equals the target, return the current index (Success).
 * 4. If they do not match, move to the next element.
 * 5. Repeat steps 2-4 until the end of the list is reached.
 * 6. If the end of the list is reached and the target is not found, return -1 (Failure).
 */

package programming.algorithm.linearsearch;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Implementation {

    // Time Complexity: O(n) - Linear time
    // Space Complexity: O(1) - No extra space used
    public static int linearSearch(List<Integer> arr, int target) {
        
        // Step 1: Traverse the list/array
        for(int i = 0; i < arr.size(); i++) {
            
            // Step 2: Compare current element with target
            if(arr.get(i) == target) {
                // Step 3: Match found, return index
                return i;
            }
        }
        
        // Step 4: Element not found after checking all
        return -1; 
    }

    // Helper method to split input string into a list of words safely
    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter numbers separated by space:");
        try {
            // Converts input line -> String Array -> Stream -> Integer List
            List<Integer> arr = splitWords(obj.nextLine())
                                    .stream()
                                    .map(Integer::parseInt)
                                    .collect(Collectors.toList());

            System.out.print("Enter target element: ");
            int target = Integer.parseInt(obj.nextLine());
            
            int res = linearSearch(arr, target);
            
            if (res != -1) {
                System.out.println("Element found at index: " + res);
            } else {
                System.out.println("Element not found.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter valid integers.");
        } finally {
            obj.close();
        }
    }
}