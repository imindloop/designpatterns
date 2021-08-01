package com.imindloop.creational.prototype;

import java.awt.geom.Point2D;

public abstract class GameUnit implements Cloneable{

    private String position;

    public GameUnit() {
        this.position = "0";
    }

    public GameUnit(float x, float y, float z) {
        position = x + " " + y + " " + z;
    }

    public void move(String direction, float distance) {
        String finalMove = direction;
        finalMove = finalMove + distance;
        position = position.concat(finalMove);
    }

    public abstract void reset();

    public String getPosition() {
        return position;
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {

        GameUnit unit = (GameUnit) super.clone();
        unit.initialize();
        return unit;
    }

    /**
     * This method has the only purpose of resetting values for clones for a shallow copy.
     */
    protected void initialize() {
        this.position = "0";
        reset();
    }
}
