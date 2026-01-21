package leetcode;

public class Q1480 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] result = Solution.runningSum(arr);
    }
}
class Solution {
    public static int[] runningSum(int[] nums) {
        if(nums.length == 1){
            return nums;
        }
        
        int[] ans = new int[nums.length];
        

        ans[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            
            System.out.println("ans[0]" + ans[0]);
            System.out.println("arr[i-1]" + ans[i-1]);
            ans[i] = ans[i-1]+nums[i];
            
            System.out.println("ans[i]: " + ans[i]);
        }
        return ans;
    }
}
