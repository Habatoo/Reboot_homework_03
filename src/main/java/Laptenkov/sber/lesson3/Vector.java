package Laptenkov.sber.lesson3;

/**
 * Класс определяет трехмерный вектор.
 * Задает общие свойства и методы работы с трехмерным вектором.
 */
public class Vector {
    private double x;
    private double y;
    private double z;

    /**
     * Конструктор трехмерного вектора.
     * Вектор {@link Vector} определяется перечнем координат в пространстве {@link Vector#x}, {@link Vector#y}, {@link Vector#z}
     * @param x любое число типа {@link double}
     * @param y любое число типа {@link double}
     * @param z любое число типа {@link double}
     */
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Метод {@link Vector#vectorLength}, вычисляет длину вектора
     * по формуле Math.sqrt(x * x + y * y + z * z).
     * Результатом работы метода является скаляр.
     * @return любое число типа {@link double}
     */
    public double vectorLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * Метод {@link Vector#vectorProductOfVectors}, вычисляет скалярное произведение с другим вектором
     * по формуле (x1 * x2 + y1 * y2 + z1 * z2).
     * @param vector объект типа {@link Vector}
     * <br>Результатом работы метода является скаляр.
     * @return любое число типа {@link double}
     */
    public double dotProductOfVectors(Vector vector) {
        return this.getX() * vector.getX() + this.getY() * vector.getY() + this.getZ() * vector.getZ();
    }

    /**
     * Метод {@link Vector#vectorProductOfVectors}, вычисляет векторное произведение с другим вектором
     * по формуле (y1 * z2 - z1 * y2, z1 * x2 - x1 * z2, x1 * y2 - y1 * x2)).
     * @param vector объект типа {@link Vector}
     * Результатом работы метода является вектор {@link Vector}.
     * @return объект типа {@link Vector}
     */
    public Vector vectorProductOfVectors (Vector vector) {
        double newX = this.getY() * vector.getZ() - this.getZ() * vector.getY();
        double newY = this.getZ() * vector.getX() - this.getX() * vector.getZ();
        double newZ = this.getX() * vector.getY() - this.getY() * vector.getX();

        return new Vector(newX, newY, newZ);
    }

    /**
     * Метод {@link Vector#toString} переопределяет отображение вектора в виде строки.
     * @return объект типа {@link String}
     */
    @Override
    public String toString() {
        return "Vector: (x = " + this.getX() + ", y = " + this.getY() + ", z = " + this.getZ() + ")";
    }

    /**
     * Метод возвращает координату вектора {@link Vector#x}.
     * @return {@link Vector#x}
     */
    public double getX() {
        return x;
    }

    /**
     * Метод возвращает координату вектора {@link Vector#y}.
     * @return {@link Vector#y}
     */
    public double getY() {
        return y;
    }

    /**
     * Метод возвращает координату вектора {@link Vector#z}.
     * @return {@link Vector#z}
     */
    public double getZ() {
        return z;
    }
}
