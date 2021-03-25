package ru.sber.lesson3.part3.constructor;

//Задача конструктора - собрать и настроить объект класса
public class Main {
}

//простой класс с конструктором
class Car {
    //Дефолтный конструктор создается всегда
    public Car() {
        System.out.println("constructor");
    }
}

//Конструктор должен называться как класс с учетом регистра и не возвращать значения, даже void
class Animal {
    //public animal() {    }

    public void Animal() {
    }
}

//Можно указывать несколько конструкторов
class Turtle {
    private String name;

    public Turtle() {
        name = "Joe";
    }

    public Turtle(int age) {
    }

    public Turtle(long age) {
    }

    public Turtle(String newName, String... favoriteFoods) {
        name = newName;
    }
}

//Можно вызывать конструктор из конструктора
class Hamster {
    private String color;
    private int weight;

    public Hamster(int weight) {
        this(weight, "brown");
    }

    public Hamster(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Hamster(String color) {
        System.out.println("in constructor");
        // Не компилируется, вызов другого конструктора всегда должен идти сначала
        //this(weight, "brown");
    }
}

//компилятор умный и не допустит циклических зависимостей
class Apple {
    /*public Apple() {
        this(5);
    }

    public Apple(int dugHoles) {
        this();
    }*/
}
