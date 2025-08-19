package Container_With_Most_Water;

import java.util.HashMap;
import java.util.Map;

public class Solution {


    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));
            if (height[left] <= height[right]) {
                left++;
            }  else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(heights));
    }
}
