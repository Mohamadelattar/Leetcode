package H_Index;

import java.util.Arrays;


public class Solution {
    public static void main(String[] args) {
        System.out.println(hIndex(new int[]{3,0,6,1,5}));
    }
    public static int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);

        for (int i = 0; i < n; i++) {
            if (citations[i] >= n - i) {
                return n - i;
            }
        }

        return 0;
    }
}
