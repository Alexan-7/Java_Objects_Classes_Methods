public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name; // this - ищем в пределах класса
        this.age = age;
    }

    public String getUserName() {
        return name;
    }

    public int getUserAge() {
        return age;
    }
}