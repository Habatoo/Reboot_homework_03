package ru.sber.lesson3.part5.overridingandload;

//Overloading vs. Overriding
//Перегрузка и переопределения

//Перегрузка и переопределение метода схожи в том, что они оба подразумевают переопределение метода с использованием
// одного и того же названия. Они отличаются тем, что в перегруженном методе будет использоваться различный список
// параметров метода. Это различие позволяет перегруженным методам гораздо больше свободы в синтаксисе,
// чем при переопределении метода.
public class Main {
}

class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }

    protected void run() {
        System.out.println("Bird is running");
    }

    public void eat(int food) {
        System.out.println("Bird is eating " + food + " units of food");
    }
}

class Eagle extends Bird {
    //Метод fly() перегружен в подклассе Eagle,
    // так как сигнатура меняется с метода без аргументов на метод с одним аргументом int.
    // Так как метод перегружен и не переопределяется, возвращаемый тип может быть изменен с void на int.
    public int fly(int height) {
        System.out.println("Bird is flying at " + height + " meters");
        return height;
    }

    //Можем расширять область видимости
    public void run() {
        System.out.println("Bird is running");
    }

    /*public int eat(int food) {
        System.out.println("Bird is eating " + food + " units of food");
        return food;
    }*/
}

class Car {
    protected CharSequence getName() {
        return "car";
    }

    protected String getColor() {
        return "grey, black, or white";
    }
}

class Lada extends Car {
    public String getName() {
        return "vaz";
    }
    //Нельзя изменять
   // public CharSequence getColor() {         return "grey";    }
}