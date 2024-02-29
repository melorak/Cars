package org.example;

public class Mane {
   public static void main (String[] args) {
        Car Toyota = new Car();
//        Toyota.model = "Corolla";
//        Toyota.color = "Grey";
//        Toyota.value = 100;
//        Toyota.fuelLevel = 60;
//        Toyota.fuelConsumption = 10;

        Car Mitsubisi = new Car("Mitsubisi", "Red", 11, 55, 123);

        Toyota.drive (10, 100, 10, 100);
       Mitsubisi.drive (100, 1000, 100, 1000);
       Mitsubisi.drive (10, 100, 10, 100);
        Mitsubisi.getOdometr();
   }
}



