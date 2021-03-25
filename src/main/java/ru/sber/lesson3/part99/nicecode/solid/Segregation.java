package ru.sber.lesson3.part99.nicecode.solid;

public class Segregation {
}

interface BearKeeper {
    void washTheBear();

    void feedTheBear();

    void petTheBear();
}

interface BearCleaner {
    void washTheBear();
}

interface BearFeeder {
    void feedTheBear();
}

interface BearPetter {
    void petTheBear();
}