package ru.sber.lesson3.part99.nicecode.solid;

public class Liskov {
}

class Engine {
    public void on() {
    }
}

interface Car {

    void turnOnEngine();
}

class MotorCar implements Car {
    private Engine engine;

    public void turnOnEngine() {
        engine.on();
    }
}

class ElectricCar implements Car {
    public void turnOnEngine() {
        throw new UnsupportedOperationException ("I don't have an engine!");
    }
}
