package com.erik;

public abstract class Figure {
     double a;
     double b;

    protected Figure(double a, double b){
        this.a=a;
        this.b=b;
    }

    public abstract double area();

    public final String callme(){
        return "Final method.";
    }

    public String toString(){
        return "Figure side:"+a+" "+b;
    }

}
