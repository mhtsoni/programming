package com.programming;

public class MergeSort {
    public int[] sortArray(int[] array) {

        return sortArrayInGivenIndexRange(array, 0 ,array.length-1);
    }

    private int[] sortArrayInGivenIndexRange(int[] array, int i, int j) {
        System.out.println(i + " " + j);
        if (i == j) {
            return new int[]{array[i]};
        } else {
            return mergeTwoSortedArrays(sortArrayInGivenIndexRange(array, i, i+ (j-i)/2),
                    sortArrayInGivenIndexRange(array,((j-i)/2)+1 + i, j));
        }
    }

    /**
     * Merge Sorted Array
     * <a href="https://leetcode.com/problems/merge-sorted-array/submissions/1125355669/">...</a>
     * @param sortedArray1
     * @param sortedArray2
     * @return sortedArray
     */
    private int[] mergeTwoSortedArrays(int[] sortedArray1, int[] sortedArray2) {
        int[] sortedArray = new int[sortedArray1.length + sortedArray2.length];
        int p1 = 0;
        int p2 = 0;
        for (int i=0; i< sortedArray.length; i++) {
            if (p1< sortedArray1.length && p2<sortedArray2.length && sortedArray1[p1] <= sortedArray2[p2]) {
                sortedArray[i] = sortedArray1[p1];
                p1++;
            } else if(p2< sortedArray2.length) {
                sortedArray[i] = sortedArray2[p2];
                p2++;
            } else if (p1<sortedArray1.length) {
                sortedArray[i] = sortedArray1[p1];
                p1++;

            }
        }
        return sortedArray;
    }
}
