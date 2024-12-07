// Полноценный класс корзины
public class Basket {
    private String items = ""; // items — это объект класса String,
                               // у него уже есть методы по умолчанию

    private int totalPrice = 0;
    private int limit;

    public Basket() {
        items = "Список товаров:";
        this.limit = 1000000;
    }

    /* Конструктор - выглядит как метод. Но у него нет void
    * его имя совпадает с именем класса */
    public Basket(int limit) {
        this(); // для вызова конструктора без параметров
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public void add(String name, int price) { // передали два параметра
        add(name, price, 1);
    }

    public void add(int count, String name) {
        /** ИМЕЕТ ЗНАЧЕНИЕ порядок параметров и их типы,
         * но НЕ имеет значения их наименование */
    }

    public void add(String name, int price, int count) {
        if (isContains(name)) { // есть ли товар, который хотим добавить
            return; // если да, то метод завершится
        }
        if ((totalPrice + count * price) >= limit) {
            return;
        }
        items = items + "\n" + name + " - " +
                count + " шт. - " + price + " руб.";
        totalPrice += count * price;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean isContains(String name) {
        return items.contains(name); // вместо условия if
    }

    public void print(String title) {
        System.out.println();
        System.out.println(title);
        if (items.isEmpty()) { // из метода print вызываем метод isEmpty
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}