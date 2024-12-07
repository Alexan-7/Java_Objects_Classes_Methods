public class Main {
    public static void main(String[] args) {
        // напишите код, в котором будут создаваться два заказа,
        // в них будут добавляться разные количества товаров, и
        // их количества затем будут выводиться в консоль

        Order kolyaOrder = new Order(); // экземпляр класса
        kolyaOrder.addProducts(59);
        kolyaOrder.addProducts(59);
        System.out.println(kolyaOrder.getProductsCount());

        Order vityaOrder = new Order(); // экземпляр класса
        vityaOrder.addProducts(43);
        vityaOrder.addProducts(35);
        System.out.println(vityaOrder.getProductsCount());
    }
}
