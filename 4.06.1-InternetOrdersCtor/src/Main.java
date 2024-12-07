public class Main {
    public static void main(String[] args) {
        User dmitry = new User("Дмитрий", 115);
        printUserInfo(dmitry);

        User olesya = new User("Олеся", 21);
        printUserInfo(olesya);

        User nikita = new User("Никита", 43);
        printUserInfo(nikita);
    }

    public static void printUserInfo(User person) { // но обычно выбирают имена,
        // которые описывают тип данных, поэтому 'user' вместо 'person' логичнее
        String years = "";
        int age = person.getUserAge();

        switch (age % 10) {
            case 1:
                years = "год";
                break;
            case 2:
            case 3:
            case 4:
                years = "года";
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
                years = "лет";
                break;
        }
        if (age % 100 >= 11 && age % 100 <= 14) {
            years = "лет"; // как исключение для вывода от 11 до 14 (или +100 к этому)
        }
        System.out.println("Пользователь: " + person.getUserName() + ", " + person.getUserAge() + " " + years);
    }
}