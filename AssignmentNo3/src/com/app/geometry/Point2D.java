package com.app.geometry;

public class Point2D {
    private int x;
    private int y;

    // Parameterized constructor
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to return point details as String
    public String getDetails() {
        return "Point coordinates: (" + x + ", " + y + ")";
    }

    // Method to check if two points are equal
    public boolean isEqual(Point2D other) {
        return (this.x == other.x && this.y == other.y);
    }

    // Method to calculate distance using Distance Formula
    public double calculateDistance(Point2D other) {
        return Math.sqrt(Math.pow((other.x - this.x), 2) + Math.pow((other.y - this.y), 2));
    }
}

