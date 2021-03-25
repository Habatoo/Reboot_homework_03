package ru.sber.lesson3.part1.create;

//Описание классов


//Пустой класс
class MyClass {

}

//Класс с состоянием и поведением
class MyClass2 {
    int x;

    int getX() {
        return x;
    }

    void printX() {
        System.out.println(x);
    }
}

//Все классы по умолчанию наследники Object
class MyClass3 extends java.lang.Object {

}

public class Main {
    public static void main(String[] args) {
        MyClass clazz = new MyClass();

        MyClass2 clazz2 = new MyClass2();
        clazz2.printX();
    }
}
