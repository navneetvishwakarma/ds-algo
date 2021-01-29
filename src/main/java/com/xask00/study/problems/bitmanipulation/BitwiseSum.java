package com.xask00.study.problems.bitmanipulation;

/**
 * Problem: Add two numbers without using arithmetic operators (by adding two numbers)
 */
public class BitwiseSum {
    public static void main(String[] args) {
        int a = 10;
        int b = 568;
        System.out.println("Sum: " + sum(a, b));
    }

    public static int sum(int a, int b) {
        while(b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
