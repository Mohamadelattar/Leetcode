package Contains_Duplicate;

import java.util.*;
import java.util.stream.IntStream;

public class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        return IntStream.of(nums)
                .anyMatch(num -> !set.add(num));
    }
}
