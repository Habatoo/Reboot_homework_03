package ru.sber.lesson3.part5.overridingandload.hiding;

public class Main {
}

class Bear {
    public static void sneeze() {
        System.out.println("Bear is sneezing");
    }

    public void hibernate() {
        System.out.println("Bear is hibernating");
    }

    public static void laugh() {
        System.out.println("Bear is laughing");
    }
}

class Panda extends Bear {
    // нельзя переопределить статик метод методом объекта
    //public void sneeze() {         System.out.println("Panda sneezes quietly");    }

    //нельзя переопределить метод объекта методом статик
    //public static void hibernate() {         System.out.println("Panda is going to sleep");    }

    //нельзя сужать видимость
    //protected static void laugh() {         System.out.println("Panda is laughing");    }
}