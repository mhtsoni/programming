package com.programming;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class MergeSortTest {
    @Test
    public void testMergeSort() {
        System.out.println(Arrays.toString(new MergeSort().sortArray(new int[]{2, 5, 7, 2, 3, 4})));
    }
}