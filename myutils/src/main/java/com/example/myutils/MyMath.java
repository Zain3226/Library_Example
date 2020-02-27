package com.example.myutils;

public class MyMath {

    public static int Plus(int a, int b){
        return a+b;
    }

    public static int Subtract(int a, int b){
        return a-b;
    }

    public static int Multiple(int a, int b){
        return a*b;
    }

    public static float Division(int a, int b){
        if(b==0){
            throw new IllegalArgumentException("Divide by zero Error");
        }
        else {
        return a/b;
        }
    }
}
