package com.epam.jwd.firstTask.validation;

import com.epam.jwd.firstTask.model.Cube;
import com.epam.jwd.firstTask.model.Point;

public class ValidationCube {
    private final String separator = ": ";

    public boolean validateObject(Cube cube) {
        double distance = cube.getA().distance(cube.getA1());

        if (cube.getB().distance(cube.getB1()) != distance) {
            return false;
        }

        if (cube.getC().distance(cube.getC1()) != distance) {
            return false;
        }

        if (cube.getD().distance(cube.getD1()) != distance) {
            return false;
        }

        if (cube.getA().distance(cube.getB()) != distance) {
            return false;
        }

        if (cube.getA().distance(cube.getD()) != distance) {
            return false;
        }

        if (cube.getC().distance(cube.getB()) != distance) {
            return false;
        }

        if (cube.getC().distance(cube.getD()) != distance) {
            return false;
        }

        if (cube.getA1().distance(cube.getB1()) != distance) {
            return false;
        }

        if (cube.getA1().distance(cube.getD1()) != distance) {
            return false;
        }

        if (cube.getC1().distance(cube.getB1()) != distance) {
            return false;
        }

        if (cube.getC1().distance(cube.getD1()) != distance) {
            return false;
        }

        return true;
    }

    public boolean validateString(String string) {
        Cube cube = new Cube();
        String exp = cube.getName() + separator;
        if (string.contains(exp)) {
            string = string.replace(exp, "");
            if (string.length() > 2) {
                string = string.replace("]", "").replace("[", "");

                String[] values = string.split(" ");
                double[] dValues = new double[8*3];

                if (values.length == 8*3) {
                    try {
                        for (int i = 0; i < 8*3; i++) {
                            dValues[i] = Double.parseDouble(values[i]);
                        }
                    }
                    catch (NumberFormatException e) {
                        return false;
                    }
                }
                else {
                    return false;
                }

                Point a = new Point (dValues[0], dValues[1], dValues[2]);
                Point b = new Point (dValues[3], dValues[4], dValues[5]);
                Point c = new Point (dValues[6], dValues[7], dValues[8]);
                Point d = new Point (dValues[9], dValues[10], dValues[11]);

                Point a1 = new Point (dValues[12], dValues[13], dValues[14]);
                Point b1 = new Point (dValues[15], dValues[16], dValues[17]);
                Point c1 = new Point (dValues[18], dValues[19], dValues[20]);
                Point d1 = new Point (dValues[21], dValues[22], dValues[23]);

                Cube testCube = new Cube(a, b, c, d, a1, b1, c1, d1);

                validateObject(testCube);

                return true;
            }
        }
        return false;
    }
}
