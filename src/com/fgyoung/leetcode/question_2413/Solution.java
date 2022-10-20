package com.fgyoung.leetcode.question_2413;

class Solution {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 1) {
            return n * 2;
        } else {
            return n;
        }
    }
}
