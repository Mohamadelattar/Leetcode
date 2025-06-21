package Find_the_Index_of_the_First_Occurrence_in_a_String;

public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){

            return haystack.indexOf(needle);
        }
        return -1;
    }
}
