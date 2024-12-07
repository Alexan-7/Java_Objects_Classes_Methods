public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.append("Some text 133", "Справка");
        printer.append("Some text 210", 544);
        System.out.println(printer.getPendingPagesCount());
        printer.print();
        printer.append("Some text 8", 530);
        printer.clear(); // после первой печати мы очистили очередь
        printer.append("Some text 23", "Договор", 312);
        printer.append("Some text 11");
        printer.print();
        System.out.println(printer.getPrintedPages());
    }
}