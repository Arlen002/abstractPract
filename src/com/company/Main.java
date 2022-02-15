package com.company;

public class Main {

    public static void main(String[] args) {
       Airplane airplane = new Airplane("L-410",2020,"3",500);
       airplane.metod();
       Avtobus avtobus  = new Avtobus("Elektrobus",2018,"20",120);
       avtobus.metod();
       Lodka lodka = new Lodka("Лодка",2000,"5",100);
       lodka.metod();
       Car car = new Car("Audi",2005,"a6",280);
       car.metod();
      Vehicle [] vehicles = {airplane,avtobus,lodka,car};

        for (Vehicle res:vehicles){
            if (res instanceof Airplane){
                System.out.println(res.getClass().getName());
                System.out.println(" Самолет класстын методдору");
                res.juru();
                ((Airplane) res).uchu();
                ((Airplane) res).skorost();
                ((Airplane) res).skorost();
            }else if (res instanceof Avtobus){
                System.out.println(res.getClass().getName());
                System.out.println(" Автобус классстын методдору");
                res.juru();
                ((Avtobus) res).eshikKJ();
                ((Avtobus) res).jyjytu();
                ((Avtobus) res).muzic();
            }else if (res instanceof Lodka){
                System.out.println(res.getClass().getName());
                System.out.println("Лодка класстын методдору");
                res.juru();
                ((Lodka) res).esaluu();
                ((Lodka) res).suzu();
            }else if (res instanceof Car){
                System.out.println(res.getClass().getName());
                System.out.println("Машина класстын методдору");
                res.juru();
                ((Car) res).shamaldatu();
            }
        }

        }
    }
