package ru.sber.lesson3.part6.modif;

public class Main {
    public static void main(String[] args) {
        Animal c = new Dog();
        System.out.print(c.getAge());
    }
}

class Animal {
    int i = 0;

    public int getAge() {
        return 1;
    }
}

class Dog extends Animal {
    private int i = 1;
    //В этом примере Animal пытается переопределить метод getAge(),
    // определенный в родительском классе, но безуспешно, так как модификатор доступа private более ограничен,
    // чем тот, который определен в родительской версии метода.
   /* private int getAge() {
        return 2;
    }*/
}
