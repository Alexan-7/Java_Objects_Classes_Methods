public class Main {
    public static void main(String[] args) {
        Employee dmitry = new Employee("Дмитрий Алексеев", 6567);
        Employee.printInfo(dmitry);

        Employee alexey = new Employee("Алексей Иванов", "aliv88@txt.re");
        Employee.printInfo(alexey);

        Employee marina = new Employee("Марина Николаева", "mar@arbek.com", 8756);
        Employee.printInfo(marina);
    }
}