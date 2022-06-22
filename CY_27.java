package com.company.java_core.homework6.task1;

public class CY_27 extends Plain implements SpecialProperties {
    public double maxSpeed;
    public String color;
    private Plain plain;
    private Control control;

    public CY_27(double maxSpeed, String color){
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Color: " + color);
    }

    @Override
    public void turbo() {
        double speed = 1000 + Math.random() * (maxSpeed + 500);
        System.out.println("Turbo acceleration: " + speed);
    }

    @Override
    public void stels() {
       double num = Math.random() * 101;
        System.out.println("The plain is not visible for: " + num);
    }

    @Override
    public void nuclear() {
        int bomb = (int) (1 + Math.random() * 11);
        System.out.println("The number of dropped bombs: " + bomb);
    }
}
