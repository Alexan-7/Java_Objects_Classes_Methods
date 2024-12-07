public class Main {
    public static void calculateTriangleSquare(
            double a, double b, double c) {
        double p = (a + b + c) / 2;
        double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(square);
    }

    public static void main(String[] args) {
        System.out.print("Площадь треугольника: ");
        calculateTriangleSquare(3, 4, 5);
    }
}