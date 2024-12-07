public class Main {
    public static void main(String[] args) {
        boolean maxNumber = max(45, 34);
        System.out.println("Первое число больше или равно второму? " + maxNumber);
    }

    public static boolean max(int a, int b) {
        return a >= b;
    }
}