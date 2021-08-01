package com.imindloop.creational.objectpool;


public class ObjectPoolClient {

    public static final ObjectPool<BitmapImage> bitmapPool = new ObjectPool<>(()-> new BitmapImage("firstBitmap.bmp"), 5);

    public static void main(String[] args) {
        BitmapImage bitmap1 = bitmapPool.get();
        bitmap1.setLocation(10);

        BitmapImage bitmap2 = bitmapPool.get();
        bitmap2.setLocation(7);

        bitmap1.draw();
        bitmap2.draw();

        bitmapPool.releaseObject(bitmap1);
        bitmapPool.releaseObject(bitmap2);
    }

}
