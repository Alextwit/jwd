package com.epam.jwd.firstTask.test;


import com.epam.jwd.firstTask.model.Cube;
import com.epam.jwd.firstTask.model.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CubeTest {
    @Test
    public void testVolume() throws Exception {
        double[] dValues = new double[24];
        for (int i = 0; i < 24; i++) {
            dValues[i] = i;
        }
        Point a = new Point(dValues[0], dValues[1], dValues[2]);
        Point b = new Point(dValues[3], dValues[4], dValues[5]);
        Point c = new Point(dValues[6], dValues[7], dValues[8]);
        Point d = new Point(dValues[9], dValues[10], dValues[11]);

        Point a1 = new Point(dValues[12], dValues[13], dValues[14]);
        Point b1 = new Point(dValues[15], dValues[16], dValues[17]);
        Point c1 = new Point(dValues[18], dValues[19], dValues[20]);
        Point d1 = new Point(dValues[21], dValues[22], dValues[23]);
        Cube cube = new Cube(a, b, c, d, a1, b1, c1, d1);
        Assert.assertEquals((int) cube.getVolume(), 8978);
    }
    @Test
    public void testSquare() throws Exception {
        double[] dValues = new double[24];
        for (int i = 0; i < 24; i++) {
            dValues[i] = i;
        }
        Point a = new Point(dValues[0], dValues[1], dValues[2]);
        Point b = new Point(dValues[3], dValues[4], dValues[5]);
        Point c = new Point(dValues[6], dValues[7], dValues[8]);
        Point d = new Point(dValues[9], dValues[10], dValues[11]);

        Point a1 = new Point(dValues[12], dValues[13], dValues[14]);
        Point b1 = new Point(dValues[15], dValues[16], dValues[17]);
        Point c1 = new Point(dValues[18], dValues[19], dValues[20]);
        Point d1 = new Point(dValues[21], dValues[22], dValues[23]);
        Cube cube = new Cube(a, b, c, d, a1, b1, c1, d1);
        Assert.assertEquals((int) cube.getSquare(), 432);
    }
}
