package ru.sber.lesson3.part2.inheritance;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.getAge());
        Cat cat = new Cat();
    }
}

//Базовый класс
class Animal {
    int age;

    public void voice() {
        System.out.println("animal");
    }

    public int getAge() {
        return age;
    }
}

//Класс наследник
class Dog extends Animal {
}

//Класс наследник
class Cat extends Animal {
}