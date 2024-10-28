package Split_With_Minimum_Sum;

import java.util.Arrays;

class Solution {
    public int splitNum(int num) {

        String s = String.valueOf(num);
        char[] test = s.toCharArray();
        Arrays.sort(test);

        StringBuilder str1 = new StringBuilder("");
        StringBuilder str2 = new StringBuilder("");
        for(int i = 0 ; i < test.length ; i++){
            if( i%2 == 0){
                str1.append(test[i]);
            }else {
                str2.append(test[i]);
            }
        }
        int num1, num2;
        num1 = Integer.parseInt(str1.toString());
        num2 = Integer.parseInt(str2.toString());
        return num1 + num2;
    }
}
