package com.epam.jwd.firstTask.test;

import com.epam.jwd.firstTask.model.Cube;
import com.epam.jwd.firstTask.model.Point;
import com.epam.jwd.firstTask.validation.ValidationCube;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationCubeTest {
    private ValidationCube validate = new ValidationCube();

    @Test
    public void testValidObject() throws Exception {
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
        Assert.assertFalse(validate.validateObject(new Cube(a, b, c, d, a1, b1, c1, d1)));
    }

    @Test
    public void testValidString() throws Exception {
        Assert.assertFalse(validate.validateString("Point: " +
                "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24"));
    }
}
