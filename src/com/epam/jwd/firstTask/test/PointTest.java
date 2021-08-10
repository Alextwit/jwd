package com.epam.jwd.firstTask.test;

import com.epam.jwd.firstTask.model.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {
    Point firstPoint = new Point(121, 223, 352);
    Point secondPoint = new Point(121, 223, 352);

    @Test
    public void testDistance() throws Exception {
        Assert.assertEquals(firstPoint.distance(secondPoint), 0.0);
    }

    @Test
    public void testDistance2() throws Exception {
        Point thirdPoint = new Point(121, 223, 353);
        Assert.assertEquals(firstPoint.distance(thirdPoint), 1.0);
    }

    @Test
    public void testDistance3() throws Exception {
        Point fourthPoint = new Point(121, 223, 0);
        Assert.assertEquals(firstPoint.distance(fourthPoint), 352.0);
    }
}
