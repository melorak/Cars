package org.example;

public class Car {
    private String model;
    private String color;
    private double fuelConsumption;
    private int value;
    private int fuelLevel;
    private int odometr = 0;

    public Car () {
        model = "model";
        color = "color";
        fuelConsumption = 0;
        value = 0;
        fuelLevel = 0;
    }

    public Car (String model, String color, double fuelConsumption, int value, int fuelLevel) {
        this.model = model;
        this.color = color;
        this.fuelConsumption = fuelConsumption;
        this.value = value;
        this.fuelLevel = fuelLevel;
    }


    void drive(int x1, int x2, int y1, int y2) {
        double path = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        fuelLevel = (int) (fuelLevel - path / 100 * fuelConsumption);
        if (fuelLevel == 0) {
            path = 0;
            System.out.println("Машине " + model + "требуется заправка. Уровень топлива = 0");
        }
        if (fuelLevel < 0) {
            System.out.println("Машина " + model + " была дозаправлена ровно " + Math.abs(fuelLevel)+ " километров" + " назад и успешно продолжила движение.");
            fuelLevel = 30;
        }
//        System.out.println("Машина " + model + " успешно доехала.");
        System.out.println ((int)path + " - путь машины. " + fuelLevel + " - остаток топлива");
        odometr += (int) path;
    }
    void getOdometr () {
        System.out.println("Показатель адометра машины " +model+ "равен: " + odometr);
    }
}
