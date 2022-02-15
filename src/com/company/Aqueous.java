package com.company;

public abstract class Aqueous extends Vehicle{
    public Aqueous(String name, int jyly, String model, int speed) {
        super(name, jyly, model, speed);
    }

    public abstract void suzu();

    public abstract void esaluu();

    @Override
    public void juru() {
        System.out.println("tez suzu");
    }
    @Override
    void metod() {
        super.metod();
    }
}
