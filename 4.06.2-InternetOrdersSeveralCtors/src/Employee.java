public class Employee {
    private String name;
    private String email = "не задан";
    private int phone;

    // В Java конструктор имеет то же имя, что и класс, и не имеет возвращаемого типа,
    // даже void, Иначе Java считает, что это обычный метод, а не конструктор.
    public Employee (String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Employee (String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    public Employee (String name, String email, int phone) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public static void printInfo(Employee employee) {
        System.out.println("Имя: " + employee.name + "\n" + "E-mail: " + employee.email + "\n"
                + "Телефон: " + ((employee.phone > 0) ? employee.phone : "не задан") + "\n");
    }
}
