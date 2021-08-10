package com.epam.jwd.firstTask.validation;

import com.epam.jwd.firstTask.exception.TooManyDotsException;
import com.epam.jwd.firstTask.model.Point;
import org.apache.logging.log4j.LogManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ValidationPoint {
    final String separator = ": ";

    private String readUsingBufferedReader(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");
        while(true) {
            try {
                if ((line = reader.readLine()) == null) {
                    break;
                }
            }
            catch (IOException e) {
                LogManager.getLogger().error("File read error - " + e.getMessage());
                e.printStackTrace();
            }
            finally {
                reader.close();
            }
            try {
                if (validateString(line)) {
                    LogManager.getLogger().info(line.toString() + " - valid");
                }
            }
            catch (TooManyDotsException e) {
                LogManager.getLogger().info(line.toString() + " - invalid");
                e.printStackTrace();
            }
        }

        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }
    public boolean validateObject (Point point) {
        if (point != null) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean validateString(String string) throws TooManyDotsException {
        Point point = new Point();
        String exp = point.getName() + separator;
        if (string.contains(exp)) {
            string = string.replace(exp, "");
            if (string.length() > 2) {
                string = string.replace("]", "").replace("[", "");
                String[] values = string.split(" ");
                double[] doubles = new double[2];
                if (values.length == 2) {
                    try {
                        doubles[0] = Double.parseDouble(values[0]);
                        doubles[1] = Double.parseDouble(values[1]);
                    }
                    catch (NumberFormatException e) {
                        return false;
                    }
                }
                else {
                    throw new TooManyDotsException("Not enough coordinates");
                }
            }
        }
        else {
            return false;
        }
        return true;
    }

}
