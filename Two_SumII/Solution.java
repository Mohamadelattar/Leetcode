package Two_SumII;

import java.util.Arrays;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while(left < right){
            if(numbers[left] + numbers[right] == target){
                return new int[]{left + 1, right +1};
            }
            else if(numbers[left] + numbers[right] > target){
                right--;
            } else {
                left++;
            }


        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int [] numbers = {-10,-8,-2,1,2,5,6};
        twoSum(numbers, 0);
        System.out.println(Arrays.toString(twoSum(numbers, 0)));
    }
}
