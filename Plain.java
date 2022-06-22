package com.company.java_core.homework6.task1;

public abstract class Plain extends Control{
    double length = 70.6;
    double width = 128.9;
    double weight = 276.7;

    public void runEngine() {
        double time = 20 + Math.random() * 69;
        System.out.println("Time to take off: " + time);
    }

    public void levitation(){
        double distance = Math.random() * 1001;
        System.out.println("Distance to take off: " + distance);
    }

    public void landing(){
        System.out.println("The plain is landing.");
    }
}
