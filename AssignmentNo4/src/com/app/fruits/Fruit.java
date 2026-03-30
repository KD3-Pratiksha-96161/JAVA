package com.app.fruits;

public abstract class Fruit {
    private String name;
    private String color;
    private double weight;
    private boolean isFresh;

    // Constructor
    public Fruit(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.isFresh = true; // Default fruit is fresh
    }

    // Abstract method to be overridden by child classes
    public abstract String taste();

    @Override
    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Weight: " + weight + "kg";
    }

    // Getters and Setters
    public String getName() 
    {
    	return name;
    	}
    public boolean isFresh() { 
    	return isFresh; 
    	}
    public void setFresh(boolean fresh) { 
    	isFresh = fresh; 
    	}
}

