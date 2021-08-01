package com.imindloop.creational.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {

    private BlockingQueue<T> availablePool;

    /**
     *
     * @param creator
     * @param count determines the number of elements in the pool
     */
    public ObjectPool(Supplier<T> creator, int count) {
        availablePool = new LinkedBlockingQueue<>();

        for(int i = 0; i < count; i++) {
            availablePool.offer(creator.get());
        }
    }

    public T get() {
        try {
            return availablePool.take();
        } catch (InterruptedException ex) {
            System.err.println("take() operation was interrupted.");
        }
        return null;
    }

    public void releaseObject(T obj) {
        obj.reset();
        try {
            availablePool.put(obj);
        } catch (InterruptedException e) {
            System.err.println("put() operation when releasing the object was interrupted.");
        }
    }


}
