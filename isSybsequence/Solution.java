package isSybsequence;

public class Solution {
    public static void main(String[] args) {
        String s = "ahbgdc";
        String t = "acb";
        int sp = 0;
        int tp = 0;

        while (sp < s.length() && tp < t.length()) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
            }
            tp++;
        }
        System.out.println(sp == s.length());
    }

}
