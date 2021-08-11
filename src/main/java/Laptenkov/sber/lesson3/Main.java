package Laptenkov.sber.lesson3;

public class Main {
    public static void main(String[] args) {
        /**
         * Создать массив типа фигура и поместить туда экземпляры каждого класса.
         */
        Square square = new Square("Square", 16);
        Square squareFigure = new Square( 10);
        Ring ring = new Ring("Ring", 12);
        Ring ringFigure = new Ring( 23);
        Parallelepiped parallelepiped = new Parallelepiped(
                "Parallelepiped", 10, 15);
        Parallelepiped parallelepipedFigure = new Parallelepiped(20, 35);
        Figure[] figures = new Figure[]{square, ring, parallelepiped, squareFigure, ringFigure, parallelepipedFigure};

        /**
         * Пройдитесь по массиву и вызовите методы получения имени и площади у каждого объекта.
         * Если этот объект параллелепипед - выведите дополнительно его объем.
         */
        for (Figure figureExample : figures) {
            System.out.println("Figure name: " + figureExample.getFigureName());
            System.out.println(figureExample.getFigureName() + " square: " + figureExample.getFigureSquare());
            if (figureExample instanceof Parallelepiped) {
                System.out.println(figureExample.getFigureName() + " Volume: " + ((Parallelepiped) figureExample).getVolume());
            }
        }
        System.out.println();

        // class Vector
        Vector firstVector = new Vector(5, 6, 7);
        Vector secondVector = new Vector(9, 13, 4);

        System.out.println("First vector length: " + firstVector.vectorLength());
        System.out.println("Second vector length: " + secondVector.vectorLength());
        System.out.println("First & Second vectors dot product: " + firstVector.dotProductOfVectors(secondVector));
        System.out.println(
                "First & Second vector product of vectors: " + firstVector.vectorProductOfVectors(secondVector));


    }
}
