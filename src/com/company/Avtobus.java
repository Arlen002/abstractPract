package com.company;

public class Avtobus extends Terrestrial{
    public Avtobus(String name, int jyly, String model, int speed) {
        super(name, jyly, model, speed);
    }

    public void eshikKJ(){
        System.out.println("Эшиги кнопка менен жабылат");
    }

    @Override
    public void jyjytu() {
        System.out.println("suukta jylytu");
    }

    @Override
    public void muzic() {
        System.out.println(" vuzic chygara alat");
    }
    @Override
    void metod() {
        super.metod();
    }

    @Override
    public void juru() {
        super.juru();
    }
}
