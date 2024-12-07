import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int number = new Scanner(System.in).nextInt();

        String str1 = String.valueOf(number);
        System.out.println("Это же число в строке: " + str1 + " - метод String.valueOf()");

        String str2 = Integer.toString(number);
        System.out.println("Это же число в строке: " + str2 + " - метод Integer.toString()");

        String str3 = number + "";
        System.out.println("Это же число в строке: " + str3 + " - конкатенация строк");

        String str4 = String.format("%d", number);
        System.out.println("Это же число в строке: " + str4 + " - метод String.format(number)");

        StringBuilder sb = new StringBuilder();
        sb.append(number);
        String str5 = sb.toString();
        System.out.println("Это же число в строке: " + str5 + " - метод StringBuilder()");
    }
}