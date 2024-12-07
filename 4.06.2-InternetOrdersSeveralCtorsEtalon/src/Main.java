public class Main {
    public static void main(String[] args) {
        Employee dmitry = new Employee("Дмитрий Алексеев", 6567);
        dmitry.printInfo();

        Employee alexey = new Employee("Алексей Иванов", "aliv88@txt.re");
        alexey.printInfo();

        Employee marina = new Employee("Марина Николаева", "mar@arbek.com", 8756);
        marina.printInfo();
    }
}