package com.imindloop.creational.prototype;

public class Swordsman extends GameUnit{

    private String state = "Idle";

    public void attack() {
        this.state = "attacking";
    }

    public String toString() {
        return "Swordsman " + state + " at " + getPosition();
    }

    @Override
    public void reset() {
        state = "Idle";
    }
}
