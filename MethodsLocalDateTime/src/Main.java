import java.time.LocalDateTime;

public class Main {
    private static void printCurrentDateTime() {
        System.out.print("Дата и время: ");
        System.out.println(LocalDateTime.now());
    }

    public static void main(String[] args) {
        printCurrentDateTime(); // вызов созданного метода
    }
}