package com.fgyoung.leetcode.question_1929;

class Solution {
    public int[] getConcatenation(int[] nums) {

        int arrayLength = nums.length;
        int[] result = new int[arrayLength * 2];
        System.arraycopy(nums, 0, result, 0, arrayLength);
        System.arraycopy(nums, 0, result, arrayLength, arrayLength);
        return result;
    }
}
