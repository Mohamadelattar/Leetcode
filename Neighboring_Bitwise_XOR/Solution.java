package Neighboring_Bitwise_XOR;

public class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int currXor=0;
        for(int i: derived)
            currXor ^= i;
        return currXor==0;
    }
}
