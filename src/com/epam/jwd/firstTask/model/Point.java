package com.epam.jwd.firstTask.model;

public class Point {
    private double x;
    private double y;
    private double z;
    private final String name = "PointFigure";

    public Point() { }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2) + Math.pow(point.z - this.z, 2));
    }

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return name + "{" + "x=" + x + ", y=" + y + ", z=" + z + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0 && Double.compare(point.z, z) == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        long bitsX = Double.doubleToLongBits(x);
        long bitsY = Double.doubleToLongBits(y);
        long bitsZ = Double.doubleToLongBits(z);
        long totalBits = bitsX * bitsY * bitsZ;
        return (int) (totalBits ^ (totalBits >>> 32));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String getName() {
        return name;
    }
}
