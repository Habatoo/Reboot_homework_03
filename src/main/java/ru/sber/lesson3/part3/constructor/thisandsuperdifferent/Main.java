package ru.sber.lesson3.part3.constructor.thisandsuperdifferent;


// Несмотря на использование одного и того же ключевого слова, this и this() очень разные.
// Первое, this, ссылается на экземпляр класса, в то время как второе, this(), ссылается на вызов конструктора внутри класса.

//Подобно this и this(), super и super() не связаны друг с другом.
// Первый, используется для ссылки на члены родительского класса, в то время как super(), вызывает родительский конструктор.

public class Main {
}

class Animal {
    private int age;

    public Animal(int age) {
        super(); // вызывает java.lang.Object
        this.age = age; // Так мы можем обращаться к полям класса
    }

    public Animal(long age1) {
        super(); // вызывает java.lang.Object
        age = (int) age1; // Так мы можем обращаться к полям класса
    }
}

class Zebra extends Animal {
    public Zebra(int age) {
        super(age); // Вызывает родительский конструктор в Animal
    }

    public Zebra() {
        this(4); // Вызывает конструктор Zebra
    }
}

class Zoo {
    public Zoo() {
        System.out.println("Zoo created");
      //  super(); // Должен быть вначале
    }
    public Zoo(int a) {
        System.out.println("Zoo created");
        //  this(); // Должен быть вначале
    }
}

class Zoo2 {
    public Zoo2() {
        super();
        System.out.println("Zoo created");
        //super(); //только первым выражением
    }
    public Zoo2(int a) {
        System.out.println("Zoo created");
        //this(); //только первым выражением
    }
}