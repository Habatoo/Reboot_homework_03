package ru.sber.lesson3.part99.nicecode.solid;

public class Single {
}

class Book {
    //...
    private String name;
    private String author;
    private String text;

    void printTextToConsole(){
        System.out.println(text);
    }
}
//Лучше делегировать
class BookPrinter {

    // methods for outputting text
    void printTextToConsole(String text){
        //our code for formatting and printing the text
    }
}