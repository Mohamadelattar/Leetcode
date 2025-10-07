package Minimum_Pair_Removal_to_Sort_ArrayI;

import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,-1,3,-2,2,1,1,1,0,-1};
        System.out.println(minimumPairRemoval(nums));
    }
    public static int minimumPairRemoval(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        int count = 0;
        for(int i = nums.length -1  ; i >= 1; i--) {
            if(nums[i] < nums[i-1]) {
                list.add(nums[i] + nums[i-1]);
                count++;
            }
        }
        return count;
    }

}
