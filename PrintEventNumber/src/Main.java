public class Main {
    public static void main(String[] args) {
        PrintEventNumber();
    }

    public static void PrintEventNumber() {
        int lastNumber = 0;
        for (int i = 0; i < 2000; i += 2) {
            System.out.println(i);
            lastNumber = i;
        }
        System.out.println(lastNumber);
    }
}