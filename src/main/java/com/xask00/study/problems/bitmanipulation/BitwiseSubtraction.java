package com.xask00.study.problems.bitmanipulation;

public class BitwiseSubtraction {
    public static void main(String[] args) {
        int a = 90;
        int b = 180;
        System.out.println("Diff: " + subtract(a, b));
    }

    public static int subtract(int a, int b) {
        while(b!=0) {
            int borrow = (~a) & b;
            a = a^b;
            b = borrow << 1;
        }
        return a;
    }
}
