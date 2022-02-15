package com.company;

public class Lodka extends Aqueous{
    public Lodka(String name, int jyly, String model, int speed) {
        super(name, jyly, model, speed);
    }

    @Override
    public void suzu() {
        System.out.println("Ocean da suzu");
    }

    @Override
    public void esaluu() {
        System.out.println(" kemede suzu");
    }

    @Override
    public void juru() {
        super.juru();
    }

    @Override
    void metod() {
        super.metod();
    }
}
