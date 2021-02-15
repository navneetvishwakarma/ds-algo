package com.xask00.study.problems.array;

public class MergeTwoSortedArray {

    public int[] merge(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        // code here
        if (n == 0) return b;
        if (m == 0) return a;
        int[] finalArr = new int[n+m];
        int nc = 0;
        int mc = 0;
        int fc = 0;
        while (nc < n && mc < m) {
            if (a[nc] < b[mc]) {
                finalArr[fc] = a[nc];
                nc++;
            } else {
                finalArr[fc] = b[mc];
                mc++;
            }
            fc++;
        }
        for (int i = nc; i < n; i++) {
            finalArr[fc++] = a[i];
        }
        for (int i = mc; i < m; i++) {
            finalArr[fc++] = b[i];
        }
        return finalArr;
    }

    public void printArray(int[] arr) {
        for(int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
