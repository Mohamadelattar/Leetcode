package Jump_game2;

public class Solution {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{1,2}));
    }
    public static int canJump(int[] nums) {
        int jump=0;
        int farthest=0;
        int current_end = 0;
        for(int i = 0; i < nums.length - 1; i++){
            farthest = Math.max(farthest, i +nums[i]);

            if (i == current_end){
                jump++;
                current_end = farthest;
            }
        }
        return jump;
    }


}
