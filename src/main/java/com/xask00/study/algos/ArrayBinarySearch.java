package com.xask00.study.algos;

public class ArrayBinarySearch {

    /**
     * Find an element in a sorted interger array.
     * @param sortedArray array sorted in ascending order.
     * @return index of the element if found otherwise -1.
     */
    public static int search(int[] sortedArray, int element) {
        if (sortedArray == null || sortedArray.length == 0) return -1;
        int foundAt = search(sortedArray, 0, sortedArray.length-1, element);
        while(foundAt > 0 && sortedArray[foundAt-1] == element) {
            foundAt--;
        }
        return foundAt;
    }

    public static int search(int[] arr, int start, int end, int element) {
        if (end >= start) {
            int mid = start + (end-start)/2;
            if (arr[mid] == element) return mid;
            if (element < arr[mid]) {
                return search(arr, start, mid-1, element);
            }
            return search(arr, mid+1, end, element);
        }
        return -1;
    }
}
