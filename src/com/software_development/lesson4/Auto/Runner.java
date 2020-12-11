package com.software_development.lesson4.Auto;

public class Runner {
    public static void main(String[] args) {
        Auto maseratiGx9 = new Auto("Maserati Gx9");
        System.out.printf("We created a car %s. Trying to drive:%n", maseratiGx9.getModelName());
        maseratiGx9.run();

        Engine engine = new Engine(370, 2.981);
        maseratiGx9.setEngine(engine);
        System.out.println("A " + engine.getPower() + " hp engine is installed. A volume of " + engine.getVolume()+" liters. Trying to drive:");

        maseratiGx9.run();

        int whellDiameter = 19;
        maseratiGx9.setWheels(new Wheel(whellDiameter), new Wheel(whellDiameter), new Wheel(whellDiameter), new Wheel(whellDiameter));
        System.out.println("Wheels are installed. Trying to drive:\n");
        maseratiGx9.run();

        maseratiGx9.getWheels().get(2).breakWheel();
        System.out.println("\nSTOP! Something broke.\nTrying to drive:");
        maseratiGx9.run();

        maseratiGx9.changeWheel();
        System.out.println("\nTrying to drive:");
        maseratiGx9.run();

        System.out.println("...");
        maseratiGx9.setFuel(false);
        maseratiGx9.run();
        maseratiGx9.refuel();
        maseratiGx9.run();

        System.out.println("\nCar model: " + maseratiGx9.getModelName());
    }
}
