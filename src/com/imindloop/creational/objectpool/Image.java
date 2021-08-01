package com.imindloop.creational.objectpool;

import java.awt.geom.Point2D;

public interface Image extends Poolable{

    void draw();

    int getLocation();

    void setLocation(int location);

}
