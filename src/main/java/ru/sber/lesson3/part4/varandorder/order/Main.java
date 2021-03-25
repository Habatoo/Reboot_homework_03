package ru.sber.lesson3.part4.varandorder.order;

public class Main {
    public static void main(String[] args) {
        //new Car();
        //new Sapsan(1);
        //System.out.println();
        //new Sapsan(2);
    }
}


class Car {
    //Переменные принадлежащие объекту загружаются при его создании
    private String name = "bmw";

    //Блоки инициализации выполняются при создании объекта
    {
        System.out.println(name);
    }

    //статические переменные создаются при загрузке класса в JVM
    private static int COUNT = 0;

    //статические блоки выполняются при загрузке класса в JVM
    static {
        System.out.println(COUNT);
    }

    {
        COUNT++;
        System.out.println(COUNT);
    }

    //конструктор выполняется в последнюю очередь
    public Car() {
        System.out.println("Constructor");
    }
}

class Train {
    static {
        System.out.print("A");
    }

    {
        System.out.print("B");
    }

    public Train(String name) {

        this(1);
        System.out.print("C");
    }

    public Train() {
        System.out.print("D");
    }

    public Train(int i) {
        System.out.print("E");
    }
}

class Sapsan extends Train {
    static {
        System.out.print("F");
    }

    public Sapsan(int i) {
        super("sapsan");
        System.out.print("G");
    }

    {
        System.out.print("H");
    }

    public static void main(String[] grass) {

    }
}