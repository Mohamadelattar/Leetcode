package Majority_Element;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
    public int majorityElement(int[] nums) {
        List<Integer> numsList  = Arrays.stream( nums)
                .boxed()
                .collect( Collectors.toList() );
        Map<Integer, Integer> duplicateCountMap = numsList
                .stream()
                .collect(
                        Collectors.toMap(Function.identity(), num -> 1, Integer::sum)
                );
        return  Collections.max(duplicateCountMap.entrySet(), Map.Entry.comparingByValue())
                .getKey()
                .intValue();

    }
}