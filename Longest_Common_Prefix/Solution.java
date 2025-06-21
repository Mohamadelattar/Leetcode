package Longest_Common_Prefix;

import java.util.Arrays;
import java.util.Optional;

class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder prefix = new StringBuilder(prefix(strs));

        while(prefix.length() > 0){
            if(containPrefix(strs , prefix.toString())){
                return prefix.toString();
            } else {
                prefix.deleteCharAt(prefix.length() - 1);
            }
        }
        return "";

    }

    public String prefix(String[] strs){
        return Arrays.stream(strs)
                .min((a, b) -> Integer.compare(a.length(), b.length()))
                .get();
    }

    public boolean containPrefix(String [] strs , String prefix) {
        return Arrays.stream(strs).allMatch(s -> s.startsWith(prefix));
    }
}
