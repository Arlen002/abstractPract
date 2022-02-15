package com.company;

public  class Car extends Vehicle{
    public Car(String name, int jyly, String model, int speed) {
        super(name, jyly, model, speed);
    }

    public void shamaldatu(){
        System.out.println("Ысыкта шамалдатуу");
    }

    @Override
    public void juru() {
        System.out.println("200 ылдамдыкта");
    }
    @Override
    void metod() {
        super.metod();
    }
}
