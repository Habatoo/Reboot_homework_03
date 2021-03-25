package ru.sber.lesson3.part5.overridingandload.withex;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
}

class Reptile {
    protected void sleepInShell() throws IOException {
    }

    protected void hideInShell() throws NumberFormatException {
    }

    protected void exitShell() throws FileNotFoundException {
    }
}

class GalapagosTortoise extends Reptile {
    //Можем сужать
    public void sleepInShell() throws FileNotFoundException {
    }

    public void hideInShell() throws IllegalArgumentException {
    }
    // Нельзя расширять исключения
    //public void exitShell() throws IOException {    }
}
