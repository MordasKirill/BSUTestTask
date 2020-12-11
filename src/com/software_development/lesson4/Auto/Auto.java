package com.software_development.lesson4.Auto;

import java.util.ArrayList;
import java.util.Arrays;


class Auto {
    private String modelName;
    private Engine engine;
    private ArrayList<Wheel> wheels;
    private boolean isFuel;

    Auto(String modelName) {
        this.modelName = modelName;
        this.wheels = new ArrayList<>(4);
        this.isFuel = true;
    }

    void setEngine(Engine engine) {
        this.engine = engine;
    }

    ArrayList<Wheel> getWheels() {
        return wheels;
    }

    void setWheels(Wheel w1, Wheel w2, Wheel w3, Wheel w4) {
        this.wheels = new ArrayList<>(Arrays.asList(w1, w2, w3, w4));
    }

    String getModelName() {
        return modelName;
    }

    void changeWheel() {
        for (int i = 0; i < 4; i++) {
            if (!wheels.get(i).isGood()) {
                System.out.println("Wheel number " + i + " is changed.\n");
                int wheelDia = this.getWheels().get(i).getDiameter();
                this.getWheels().set(i, new Wheel(wheelDia));
            }
        }
    }

    void setFuel(boolean fuel) {
        this.isFuel = fuel;
    }

    void refuel() {
        this.isFuel = true;
        System.out.println("The car is refueled.");
    }


    void run() {
        int wheelCounter = 0;
        boolean isEngine = false;

        for (Wheel wheel : wheels) {
            if (wheel != null) {
                wheelCounter++;
            }
        }
        if (wheelCounter == 0) {
            System.out.println("- wheels are not installed. please install 4 wheels.\n");
        } else if (wheelCounter != 4) {
            System.out.println("- only 1 wheel installed. please install 3 more wheels\n");
        }

        if (engine == null) {
            System.out.println("- engine not installed. please install the engine.");
        } else {
            isEngine = true;
        }

        if (isEngine && wheelCounter == 4) {
            boolean ready = true;
            for (int i = 0; i < 4; i++) {
                if (!wheels.get(i).isGood()) {
                    System.out.println("- wheel number " + i + " is broken. Please replace the wheel." );
                    ready = false;
                }
            }
            if (!isFuel) {
                System.out.println("- out of fuel. It is necessary to refuel.");
            } else if (ready) {
                System.out.println("- the car goes on the road!");
            }
        }

    }

}