package ru.sber.lesson3.part2.astraction;


public class Main {
}

//На данном уровне абстракции основные данные автомобиля, которые нас интересуют - скорость и масса
class Car {
    int maxSpeed;
    int weight;

    public void drive() {
    }
}

//В этой абстракции нам интересен только цвет
class MyCar {
    int color;

    public void drive() {
    }
}