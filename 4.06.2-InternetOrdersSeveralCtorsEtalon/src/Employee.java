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

    public void printInfo() {
        System.out.println("Имя: " + name + "\n" + "E-mail: " + email + "\n"
                + "Телефон: " + ((phone > 0) ? phone : "не задан") + "\n");
    }
}
