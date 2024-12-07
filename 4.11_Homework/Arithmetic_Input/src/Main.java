import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = input.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = input.nextInt();

        Arithmetic calculator = new Arithmetic(number1, number2);
        System.out.println("Сумма чисел: " + calculator.sumOfNumbers());
        System.out.println("Произведение чисел: " + calculator.multOfNumbers());
        System.out.println("Максимальное из чисел: " + calculator.maxOfNumbers());
        System.out.println("Минимальное из чисел: " + calculator.minOfNumbers());
    }
}