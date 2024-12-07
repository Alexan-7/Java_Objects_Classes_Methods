/**
 * Это точка 2D
 * */

public class Paint2D {
    private int x, y; // теперь это ПОЛЯ - раньше называли переменными

    /**
     * Это конструктор...
     * @param valueX это координата X
     * @param valueY это координата Y
     */

    public Paint2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Paint2D(int value) {
//        this.x = value;
//        this.y = value;
        this(value, value);
    }
    public Paint2D() {
        this(0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //    public Paint2D() {
//        x = 0;
//        y = 0;
//    }
//
//    public Paint2D(int value) {
//        x = value;
//        y = value;
//    }

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }

    public String getInfo() {
        return String.format("x: %d; y: %d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
