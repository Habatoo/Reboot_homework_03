package ru.sber.lesson3.part2.poly;

public class Main2 {
    public static void main(String[] args) {
        WildAnimal animal = new Puma();
        animal.voice();
        WildAnimal wildAnimal = new WildAnimal() {
            @Override
            void voice() {
                System.out.println("An");
            }
        };
        wildAnimal.voice();
        System.out.println(wildAnimal.getClass());
    }
}

//Класс требует от потомков реализации поведения
abstract class WildAnimal {
    abstract void voice();
}

//Класс, который наследует поведение базового
class Puma extends WildAnimal {
    @Override
    public void voice() {
        System.out.println("Puma");
    }
}

//Класс, который наследует поведение базового
class Tiger extends WildAnimal {
    @Override
    public void voice() {
        System.out.println("Tiger");
    }
}

