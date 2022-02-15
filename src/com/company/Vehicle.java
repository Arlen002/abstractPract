package com.company;

public abstract class Vehicle {
    private String name;
    private int jyly;
    private String model;
    private int speed;

    public Vehicle(String name, int jyly, String model, int speed) {
        this.name = name;
        this.jyly = jyly;
        this.model = model;
        this.speed = speed;
    }

    public abstract void juru();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJyly() {
        return jyly;
    }

    public void setJyly(int jyly) {
        this.jyly = jyly;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    void metod(){
        System.out.println(" Названия:"+getName()+" жылы - "+getJyly()+" модел - "+getModel()+" мах/с - "+getSpeed());
    }
}
