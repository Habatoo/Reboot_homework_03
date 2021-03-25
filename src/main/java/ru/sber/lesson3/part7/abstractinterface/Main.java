package ru.sber.lesson3.part7.abstractinterface;

public class Main {
}

//Интерфейсы считаются абстрактными.
//Предполагается, что переменные интерфейса являются общедоступными, статическими и конечными.
//Методы интерфейса без тела считаются абстрактными и публичными.

interface Bird {
    int MAX_HEIGHT = 10;
    final static boolean UNDERWATER = false;

    void fly(int speed);

    abstract void takeoff();

    public abstract double dive();
}

abstract class Bird2{
    int MAX_HEIGHT = 10;
    final static boolean UNDERWATER = false;

    //должны пометить метод как абстрактный
    //void fly(int speed);

    abstract void takeoff();

    public abstract double dive();
}


