package com.erik;

public class AbstractFigureDemo {

    public static void main(String[] args) {

        com.erik.Rectangle r = new com.erik.Rectangle(2,3);
        Triangle t=new Triangle(6,8);

        System.out.println(r.area() );
        System.out.println(r.callme() );
        System.out.println(t.area());

    }
}

