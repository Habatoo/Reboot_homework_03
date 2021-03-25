package ru.sber.lesson3.part2.poly;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.voice();
    }
}

//Базовый класс
class Animal {
    public void voice() {
        System.out.println("Animal");
    }
}

//Класс, который наследует поведение базового
class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Dog");
    }
}

//Класс, который наследует поведение базового
class Cat extends Animal {
    @Override
    public void voice() {
        System.out.println("Cat");
    }
}
