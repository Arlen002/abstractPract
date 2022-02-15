package com.company;

public abstract class Air extends Vehicle{
    public Air(String name, int jyly, String model, int speed) {
        super(name, jyly, model, speed);
    }

   public abstract void uchu();

    public abstract void skorost();

    @Override
    public void juru() {
        System.out.println("tez uldamdykta");
    }

    @Override
    void metod() {
        super.metod();
    }
}
