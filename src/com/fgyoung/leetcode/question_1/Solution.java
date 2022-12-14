package com.fgyoung.leetcode.question_1;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int lookFor = target - current;
            if (seen.containsKey(lookFor)) {
                result[0] = seen.get(lookFor);
                result[1] = i;
                break;
            } else {
                seen.put(current, i);
            }
        }
        return result;
    }
}