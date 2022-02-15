package com.company;

public class Airplane extends Air{
    public Airplane(String name, int jyly, String model, int speed) {
        super(name, jyly, model, speed);
    }

    public void tezjetkiry(){
        System.out.println("машинага караганда тез журот");
    }

    @Override
    public void juru() {
        super.juru();
    }

    @Override
    public void uchu() {
        System.out.println(" бийик учу");
    }

    @Override
    public void skorost() {
        System.out.println( " 500 ");
    }
    @Override
    void metod() {
        super.metod();
    }
}
