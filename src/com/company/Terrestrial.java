package com.company;

public abstract class Terrestrial extends Vehicle {
    public Terrestrial(String name, int jyly, String model, int speed) {
        super(name, jyly, model, speed);
    }

    public abstract void jyjytu();

    public abstract void muzic();

    @Override
    public void juru() {
        System.out.println("tez juru");
    }
    @Override
    void metod() {
        super.metod();
    }
}
