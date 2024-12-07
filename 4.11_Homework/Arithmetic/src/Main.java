public class Main {
    public static void main(String[] args) {
        Arithmetic calculator = new Arithmetic(7, 5);
        System.out.println("Сумма чисел: " + calculator.sumOfNumbers());
        System.out.println("Произведение чисел: " + calculator.multOfNumbers());
        System.out.println("Максимальное из чисел: " + calculator.maxOfNumbers());
        System.out.println("Минимальное из чисел: " + calculator.minOfNumbers());
    }
}