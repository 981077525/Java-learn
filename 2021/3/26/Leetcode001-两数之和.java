package leetcode;

public class Solution001 {
     public static int[] twoSum(int[] nums, int target) {
         int[] ret = new int[2];

         for(int i = 0;i<nums.length ;i++){
             for(int j = i + 1 ; j<nums.length; j++){
                 if(nums[i] + nums[j] == target){
                     ret[0] = i;
                     ret[1] = j;
                     return ret;
                 }
             }
         }
        return ret;
     }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(twoSum(nums, target)[0]);
    }
}
