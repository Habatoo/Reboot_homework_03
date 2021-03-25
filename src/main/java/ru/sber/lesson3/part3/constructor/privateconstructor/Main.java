package ru.sber.lesson3.part3.constructor.privateconstructor;

//Final class не может быть наследников.
// Тоже происходит и если есть приватный конструктор, но с помощью вложенного класса можно обойти это ограничение
public class Main {
    public static void main(String[] args) {
        //new Animal();
    }
}

//Приватный конструктор
class Animal {
    private Animal() {
    }

    public static Animal getAnimal() {
        return new Animal();
    }

}

final class Animal2 {

}

//class B extends Animal2{}