package com.imindloop.creational.prototype;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman s1 = new Swordsman();
        s1.move("right", 5);
        s1.attack();

        System.out.println(s1);

        Swordsman s2 = (Swordsman) s1.clone();
        System.out.println("This is Swordsman  2 " + s2);
    }
}
