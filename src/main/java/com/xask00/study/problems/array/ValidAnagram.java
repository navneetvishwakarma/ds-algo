package com.xask00.study.problems.array;

/**
 * https://leetcode.com/problems/valid-anagram/description/
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; // If lengths differ, they cannot be anagrams
        }
        int[] charCount = new int[26]; // Assuming only lowercase letters a-z
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a'] += 1;
            charCount[t.charAt(i) - 'a'] -= 1;
        }
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] != 0) return false;
        }

        return true;
    }
}
