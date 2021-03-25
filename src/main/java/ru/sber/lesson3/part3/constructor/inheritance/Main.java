package ru.sber.lesson3.part3.constructor.inheritance;

public class Main {
}
//Если мы указываем конструктор, то дефолтный java не добавляет
class Car {
    public Car(int age) {
    }
}

//class Porsche extends Car {} // не компилируется


/*class Porsche extends Car {
    public Porsche(int age) {
        super(age);
    }
} */


//public Porsche() {
//super();
// super(10);}