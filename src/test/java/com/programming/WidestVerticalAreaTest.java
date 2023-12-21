package com.programming;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class WidestVerticalAreaTest {
    @Test
    public void testWidestVerticalArea() {
        int[][] points = {{8,7},{9,9},{7,4},{9,7}};
        System.out.println(new WidestVerticalArea().maxWidthOfVerticalArea(points));
    }
}
