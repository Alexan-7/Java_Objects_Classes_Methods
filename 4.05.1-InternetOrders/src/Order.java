public class Order {
    private int count = 0; // количество товаров

    // добавляет товары в заказ
    public void addProducts(int productsCount) {
        count += productsCount; // количество товаров
    }

    // возвращает количество товаров
    public int getProductsCount() {
        return count;
    }
}
