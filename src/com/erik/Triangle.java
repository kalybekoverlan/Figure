package com.erik;

public class Triangle extends Figure{

    public Triangle(double a,double b){
        super(a,b);
    }

    public double area(){
        return (a*b)/2;
    }

}
