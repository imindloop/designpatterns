package com.imindloop.creational.prototype;

public class General extends GameUnit{

    private String state = "Idle";

    public void boostMorale() {
        this.state = "Morale Boosted";
    }

    @Override
    public String toString() {
        return "General{" +
                "state='" + state + '\'' +
                "position='" + getPosition() +
                '}';
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException("Reset is not supported because this class is oh la la, unique!");
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
       throw new CloneNotSupportedException("Generals are so freaking unique.");
    }
}
