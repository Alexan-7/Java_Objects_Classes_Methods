// параметры методов
public class Basket {
    private static String items = ""; // items — это объект класса String,
                                      // у него уже есть методы по умолчанию

    private static int totalPrice = 0;

    public static void main(String[] args) {
        add("Колбаса", 160); // метод add - это мы написали
        add("Молоко", 87);   // ctrl - перейти в этот метод
        add("Хлеб", 30);
        print("Содержимое корзины:");
        int totalPrice = getTotalPrice();
        System.out.println("Общая стоимость товаров: " + totalPrice);
        clear();
        print("Содержимое корзины:");
        System.out.println("Общая стоимость товаров: " + totalPrice);
    }

    public static void add(String name, int price) { // передали два параметра
        if (isContains(name)) { // есть ли товар, который хотим добавить
            return; // если да, то метод завершится
        }
        items = items + "\n" + name + " - " + price + " руб.";
        totalPrice += price;
    }

    public static void clear() {
        items = "";
        totalPrice = 0;
    }

    public static int getTotalPrice() {
        return totalPrice;
    }

    public static boolean isContains(String name) {
//        if (items.contains(name)) {
//            return true;
//        } return false;
        return items.contains(name); // вместо условия if
    }

    public static void print(String title) {
        System.out.println();
        System.out.println(title);
        if (items.isEmpty()) { // из метода print вызываем метод isEmpty
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}