package com.example.team19;

public abstract class Shape {
    
    private String color = "$PUT_YOUR_CHOICE_OF_COLOR";
    private int x;
    private int y;
    String color "blue";

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
