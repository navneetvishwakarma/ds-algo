package com.xask00.study.problems.stack;

import java.util.Stack;

public class ParenthesisChecker {

    public boolean isValid(String parenthesisStr) {
        if (parenthesisStr == null || parenthesisStr.isBlank()) {
            return true;
        }
        Stack<Character> characterStack = new Stack<>();
        for (char parenthesis: parenthesisStr.toCharArray()) {
            if (parenthesis == '(' || parenthesis == '{' || parenthesis == '[') {
                characterStack.push(parenthesis);
            } else {
                if (characterStack.isEmpty()) {
                    return false;
                }
                if ((parenthesis == ')' && characterStack.peek() == '(') ||
                        (parenthesis == '}' && characterStack.peek() == '{') ||
                        (parenthesis == ']' && characterStack.peek() == '[')) {
                    characterStack.pop();
                } else {
                    return false;
                }
            }
        }
        return characterStack.isEmpty();
    }
}
