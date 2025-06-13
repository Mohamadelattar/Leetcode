package Group_Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();

        if(strs.length == 1) {
            ans.add(Arrays.asList(strs));
            return ans;
        }
        List<String> temp = new ArrayList<>();
        temp.add(strs[0]);
        ans.add(temp);

        for(int i = 1; i < strs.length; i++) {
            int indexAns = 0;
            boolean isAngram = false;

            while (isAngram == false && indexAns < ans.size()) {
                isAngram = isAnagramList(ans.get(indexAns), strs[i]);
                if(isAngram){
                    ans.get(indexAns).add(strs[i]);
                    break;
                } else {
                    indexAns++;
                }

            }
            if (!isAngram && indexAns == ans.size()) {
                List<String> temp1 = new ArrayList<>();
                temp1.add(strs[i]);
                ans.add(temp1);
            }
        }

        return ans;
    }



    public  boolean isAnagramList(List<String> stringList, String s) {
        char[] sChars = s.toCharArray();
        char[] stringListChar = stringList.getFirst().toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(stringListChar );

        return Arrays.equals(sChars, stringListChar );
    }
}