package Length_of_Last_Word;

import java.util.Arrays;
class Solution {
    public int lengthOfLastWord(String s) {
        String output = Arrays.stream(s.split(" "))
                .reduce((first , second) -> second)
                .orElse("");
        return output.length();
    }
}