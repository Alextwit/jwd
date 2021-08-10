package com.epam.jwd.firstTask.model;

import org.apache.logging.log4j.LogManager;

public class Cube {
    private final String name = "CubeFigure";

    private Point a;
    private Point b;
    private Point c;
    private Point d;

    private Point a1;
    private Point b1;
    private Point c1;
    private Point d1;

    public Cube() {}

    public Cube(Point a, Point b, Point c, Point d, Point a1, Point b1, Point c1, Point d1)  {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.a1 = a1;
        this.b1 = b1;
        this.c1 = c1;
        this.d1 = d1;
    }

    public double getVolume() {
        LogManager.getLogger().info("Calculated the volume of the cube");
        return Math.pow(a.distance(a1), 3);
    }
    public double getSquare() {
        LogManager.getLogger().info("Calculated the square of the cube");
        return Math.pow(a.distance(a1), 2);
    }

    boolean isLayOnFlat(double aMultiplier, double bMultiplier, double cMultiplier, double dNumber) {
        if ((aMultiplier*this.a.getX() + bMultiplier*this.a.getY() + cMultiplier*this.a.getZ() + dNumber) == 0) {
            if ((aMultiplier*this.b.getX() + bMultiplier*this.b.getY() + cMultiplier*this.b.getZ() + dNumber) == 0) {
                return true;
            }

            if ((aMultiplier*this.d.getX() + bMultiplier*this.d.getY() + cMultiplier*this.d.getZ() + dNumber) == 0) {
                return true;
            }

            if ((aMultiplier*this.c.getX() + bMultiplier*this.c.getY() + cMultiplier*this.c.getZ() + dNumber) == 0) {
                return true;
            }
        }

        if ((aMultiplier*this.c1.getX() + bMultiplier*this.c1.getY() + cMultiplier*this.c1.getZ() + dNumber) == 0) {
            if ((aMultiplier*this.a1.getX() + bMultiplier*this.a1.getY() + cMultiplier*this.a1.getZ() + dNumber) == 0) {
                return true;
            }

            if ((aMultiplier*this.c.getX() + bMultiplier*this.c.getY() + cMultiplier*this.c.getZ() + dNumber) == 0) {
                return true;
            }

            if ((aMultiplier*this.b.getX() + bMultiplier*this.b.getY() + cMultiplier*this.b.getZ() + dNumber) == 0) {
                return true;
            }
        }
        return false;
    }

    String getRatio(Point target) {
        double upper = target.distance(a);
        double lower = target.distance(a1);

        double upperVolume = upper*a.distance(a1)*a.distance(a1);
        double lowerVolume = lower*a.distance(a1)*a.distance(a1);

        return "(" + upperVolume + ":" + lowerVolume + ")";
    }

    @Override
    public String toString() {
        return name + "{" + "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", a1=" + a1 + "," +
                " b1" + b1 + ", c1=" + c1 + ", d1=" + d1;
    }

    public String getName() {
        return name;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    public Point getA1() {
        return a1;
    }

    public void setA1(Point a1) {
        this.a1 = a1;
    }

    public Point getB1() {
        return b1;
    }

    public void setB1(Point b1) {
        this.b1 = b1;
    }

    public Point getC1() {
        return c1;
    }

    public void setC1(Point c1) {
        this.c1 = c1;
    }

    public Point getD1() {
        return d1;
    }

    public void setD1(Point d1) {
        this.d1 = d1;
    }
}
