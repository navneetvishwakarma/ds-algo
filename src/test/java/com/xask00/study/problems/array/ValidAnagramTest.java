package com.xask00.study.problems.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidAnagramTest {
    ValidAnagram validAnagram;

    @Before
    public void setup() {
        this.validAnagram = new ValidAnagram();
    }

    @Test
    public void ValidAnagram() {
        String s = "anagram";
        String t = "nagaram";

        Assert.assertTrue(this.validAnagram.isAnagram(s, t));
    }

    @Test
    public void InvalidAnagram() {
        String s = "car";
        String t = "art";

        Assert.assertFalse(this.validAnagram.isAnagram(s, t));
    }
}
