package Jump_game;

public class Solution {

    public boolean canJump(int[] nums) {
        int jumps = nums[0];
        while(jumps < nums[nums.length - 1]){
            jumps += nums[jumps];
            if(jumps == nums[nums.length - 1])
                return true;
        }
        return false;
    }
}
