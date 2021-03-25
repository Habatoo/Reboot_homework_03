package ru.sber.lesson3.part8.instanceofgetclass;

public class Main {
    public static void main(String[] args) {
        Ring ring = new Ring();
        System.out.println(ring instanceof Round);
    }
}
class Round {

}
class Ring extends Round {

}
