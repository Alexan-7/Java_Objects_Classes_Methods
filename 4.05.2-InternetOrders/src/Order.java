public class Order {
    private int count = 0; // количество товаров
    private int totalCost = 0;

    // добавляет товары в заказ
    public void addProducts(int productsCount, int cost) {
        count += productsCount; // количество товаров
        totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    // возвращает количество товаров
    public int getProductsCount() {
        return count;
    }

    public void print(String title) {
        System.out.println();
        System.out.println(title);
    }
}
