package com.xask00.study.problems.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParenthesisCheckerTest {
    private ParenthesisChecker parenthesisChecker;

    @Before
    public void setup() {
        this.parenthesisChecker = new ParenthesisChecker();
    }

    @Test
    public void emptyStringCheck() {
        Assert.assertTrue("NULL String should return true", parenthesisChecker.isValid(null));
        Assert.assertTrue("Empty String should return true", parenthesisChecker.isValid(""));
        Assert.assertTrue("Spaces String should return true", parenthesisChecker.isValid("  "));
    }

    @Test
    public void validParenthesisCheck() {
        Assert.assertTrue("Should return true", parenthesisChecker.isValid("[{()}](){}{()}"));
        Assert.assertTrue("Should return true", parenthesisChecker.isValid("[{}{}]"));
    }

    @Test
    public void invalidParenthesisCheck() {
        Assert.assertFalse("Should return false", parenthesisChecker.isValid("[{()}]{(){}{()}"));
        Assert.assertFalse("Should return false", parenthesisChecker.isValid("[{}{})]"));
        Assert.assertFalse("Should return false", parenthesisChecker.isValid("[]]]"));
        Assert.assertFalse("Should return false", parenthesisChecker.isValid("((({"));
    }
}
