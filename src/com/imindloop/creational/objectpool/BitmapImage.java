package com.imindloop.creational.objectpool;


public class BitmapImage implements Image{

    private int location;

    private String name;

    public BitmapImage(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing bitmap " + name + " at location " + location);
    }

    @Override
    public int getLocation() {
        return location;
    }

    @Override
    public void setLocation(int location) {
        this.location = location;
    }


    @Override
    public void reset() {
        System.out.println("Resetting Bitmap image...");
        location = 0;
        System.out.println("Reset of Bitmap image completed.");
    }
}
