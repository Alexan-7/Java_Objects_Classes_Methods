public class Main {
    public static void main(String[] args) {
        // напишите код, в котором будут создаваться два заказа,
        // в них будут добавляться разные количества товаров, и
        // их количества затем будут выводиться в консоль

        Order kolyaOrder = new Order(); // экземпляр класса
        kolyaOrder.print("Корзина Коли");
        kolyaOrder.addProducts(594, 18777);
        kolyaOrder.addProducts(594, 58888);
        System.out.println("Количество товара: " + kolyaOrder.getProductsCount());
        System.out.println("Цена товара: " + kolyaOrder.getTotalCost());

        Order vityaOrder = new Order(); // экземпляр класса
        vityaOrder.print("Корзина Вити");
        vityaOrder.addProducts(436, 38777);
        vityaOrder.addProducts(352, 78000);
        System.out.println("Количество товара: " + vityaOrder.getProductsCount());
        System.out.println("Цена товара: " + vityaOrder.getTotalCost());



    }
}
