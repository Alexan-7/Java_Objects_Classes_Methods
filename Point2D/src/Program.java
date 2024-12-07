public class Program {
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    static double distance(Paint2D a, Paint2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {
        Paint2D a = new Paint2D(0, 2); // определяем экземпляр класса "Точка"
        a.setX(12);
        System.out.println(a.getX());
        System.out.println(a.getY());

        Paint2D b = new Paint2D(10);
        System.out.println(b.toString());
        System.out.println(distance(a, b));
    }
}

//TODO навести курсор на Paint2D