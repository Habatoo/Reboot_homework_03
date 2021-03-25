package ru.sber.lesson3.part2.incapsulation;

class MyClass {
    //Доступ к этим данным закрыт
    private int x;
    int y;

    //Получить данные можем только через методы
    int getX() {
        return x;
    }

    //Методы могут как-то изменять данные, если это необходимо
    int getX2() {
        return x * 2;
    }

    // или проверять данные перед измененеием
    void setX(int newX) {
        if (x > 0) {
            x = newX;
        }
    }

    //так же методы могут быть только ля внутреннего потребления
    private int getY() {
        return y;
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.getX();
    }
}
