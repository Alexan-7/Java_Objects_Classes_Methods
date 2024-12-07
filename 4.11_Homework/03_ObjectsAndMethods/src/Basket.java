public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private Double totalWeight = 0.0; // вес товаров может быть дробным

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price;
        totalPrice = totalPrice + count * price;
    }

    // Новый метод с параметром веса из задания
    public void add(String name, int price, int count, double weight) {
        add(name, price, count);
        totalWeight += count * weight;
    }

    // возвращает значение массы всех товаров
    public double getTotalWeight() {
        return Math.round(totalWeight * 100.0) / 100.0;
        // округлить до двух десятичных знаков с Math.round():
        // число сначала умножается на 100, а затем делится на 100
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items + "\n\n" + "Масса товаров, имеющих вес: " +
                    getTotalWeight() + " кг." + "\n" + "Общая сумма товаров: " +
                    getTotalPrice() + " руб.");
        }
    }
}
