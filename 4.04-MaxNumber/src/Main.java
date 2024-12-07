public class Main {
    // public - метод или переменная может быть доступна из любого другого класса или пакета
    // private - метод или переменная доступна только внутри того же класса, где он объявлен
    public static void main(String[] args) {
        int maxNumber = max(45, 34);
        System.out.println("Большее из двух чисел: " + maxNumber);
    }

    public static int max(int a, int b) {
//        if (a >= b) {
//            return a;
//        }
//        return b;
        return a >= b ? a : b;
    }
}