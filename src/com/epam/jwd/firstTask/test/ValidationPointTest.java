package com.epam.jwd.firstTask.test;


import com.epam.jwd.firstTask.model.Point;
import com.epam.jwd.firstTask.validation.ValidationPoint;
import org.junit.Assert;
import org.testng.annotations.Test;

public class ValidationPointTest {
    private final ValidationPoint validationPoint = new ValidationPoint();

    @Test
    public void TestValidObject() throws Exception {
        Assert.assertTrue(validationPoint.validateObject(new Point()));
    }

    @Test
    public void testValidString() throws Exception {
        Assert.assertTrue(validationPoint.validateString("PointFigure: [2 3]"));
    }
}
