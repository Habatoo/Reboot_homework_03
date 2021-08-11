package Laptenkov.sber.lesson3;

/**
 * Общий класс фигуры.
 * Задает общие свойства конкретных реализаций геометрических фигур.
 */
public abstract class Figure {
    private String figureName;
    private double figureSquare;

    /**
     * Конструктор геометрической фигуры.
     * Фигура определяется именем фигуры {@link Figure#figureName}
     * @param figureName
     */
    public Figure(String figureName) {
        this.figureName = figureName;
    }

    /**
     * Пустой конструктор геометрической фигуры.
     * По умолчанию фигура бех имени - "Figure"
     */
    public Figure() {
        this.figureName = "Figure";
    }

    /**
     * Метод {@link Figure#getFigureName} возвращает наименование фигуры
     * @return {@link Figure#figureName}
     */
    public String getFigureName() {
        return figureName;
    };

    /**
     * Метод {@link Figure#getFigureSquare} возвращает площадь фигуры
     * @return {@link Figure#figureSquare} - большее или равное нулю число типа {@link double}
     */
    public abstract double getFigureSquare();

}

/**
 * Общий класс квадрат {@link Square}.
 * Задает свойства конкретных реализаций квадратов.
 * @see {@link Figure}
 */
class Square extends Figure {
    private double sideOfSquare;

    /**
     * Конструктор квадрата.
     * Квадрат определяется наименованием квадрата {@link Figure#getFigureName} и
     * длинной стороны квадрата {@link Square#sideOfSquare}
     * @param figureName
     * @param sideOfSquare
     */
    public Square(String figureName, double sideOfSquare) {
        super(figureName);
        this.sideOfSquare = sideOfSquare;
    }

    /**
     * Конструктор квадрата без имени.
     * Квадрат с имннем по умолчанию определяется
     * длинной стороны квадрата {@link Square#sideOfSquare}
     * @param sideOfSquare
     */
    public Square(double sideOfSquare) {
        this.sideOfSquare = sideOfSquare;
    }

    /**
     * Метод {@link Square#getSideOfSquare} возвращает сторону квадрата.
     * @return большее или равное нулю число типа {@link double}
     */
    public double getSideOfSquare() {
        return sideOfSquare;
    }

    /**
     * Метод {@link Square#getFigureSquare} возвращает площадь квадрата.
     * @return большее или равное нулю число типа {@link double}
     */
    @Override
    public double getFigureSquare() {
        return sideOfSquare * sideOfSquare;
    }

}

/**
 * Общий класс круг {@link Ring}.
 * Задает свойства конкретных реализаций круга.
 * @see {@link Figure}
 */
class Ring extends Figure {
    private double ringRadius;
    final double PI = Math.PI;

    /**
     * Конструктор круга {@link Ring}.
     * Круг определяется наименованием круга {@link Figure#getFigureName} и
     * радиусом круга {@link Ring#ringRadius}
     * @param figureName {@link Figure#getFigureName}
     * @param ringRadius {@link Ring#ringRadius}
     */
    public Ring(String figureName, double ringRadius) {
        super(figureName);
        this.ringRadius = ringRadius;
    }

    /**
     * Конструктор круга {@link Ring} без имени.
     * Круг с именем по умолчанию определяется
     * радиусом круга {@link Ring#ringRadius}
     * @param ringRadius {@link Ring#ringRadius}
     */
    public Ring(double ringRadius) {
        this.ringRadius = ringRadius;
    }

    /**
     * Метод {@link Ring#getFigureSquare} возвращает площадь круга.
     * @return большее или равное нулю число типа {@link double}
     */
    @Override
    public double getFigureSquare() {
        return PI * ringRadius * ringRadius;
    }

}

/**
 * Общий класс параллелепипед {@link Parallelepiped}.
 * Задает свойства конкретных реализаций параллелепипедов.
 * @see {@link Figure}
 * @see {@link Square}
 */
class Parallelepiped extends Square {
    private double parallelepipedHeight;

    /**
     * Конструктор параллелепипеда {@link Parallelepiped}.
     * Параллелепипед определяется наименованием {@link Figure#getFigureName},
     * длинной стороны параллелепипеда {@link Parallelepiped#getSideOfSquare} и
     * высотой параллелепипеда {@link Parallelepiped#parallelepipedHeight}
     * @param figureName
     * @param sideOfSquare
     * @param parallelepipedHeight
     */
    public Parallelepiped(String figureName, double sideOfSquare, double parallelepipedHeight) {
        super(figureName, sideOfSquare);
        this.parallelepipedHeight = parallelepipedHeight;
    }

    /**
     * Конструктор параллелепипеда {@link Parallelepiped} с именем по умолчанию.
     * Параллелепипед с именем по умолчанию определяется
     * длинной стороны параллелепипеда {@link Parallelepiped#getSideOfSquare} и
     * высотой параллелепипеда {@link Parallelepiped#parallelepipedHeight}
     * @param sideOfSquare
     * @param parallelepipedHeight
     */
    public Parallelepiped(double sideOfSquare, double parallelepipedHeight) {
        super(sideOfSquare);
        this.parallelepipedHeight = parallelepipedHeight;
    }

    /**
     * Метод {@link Parallelepiped#getVolume} возвращает объем параллелепипеда.
     * @return большее или равное нулю число типа {@link double}
     */
    public double getVolume() {
        return this.getSideOfSquare() * this.getSideOfSquare() * parallelepipedHeight;
    }
}
