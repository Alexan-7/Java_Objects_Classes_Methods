public class Main {
    public static void main(String[] args) {
        // создаём корзины отдельных пользователей
        Basket vasyaBasket = new Basket(); // экземпляр класса
        vasyaBasket.add("Молоко", 80);
        vasyaBasket.add("Хлеб", 40);

        Basket petyaBasket = new Basket(110); // экземпляр класса
        petyaBasket.add("Колбаса", 90);
        petyaBasket.add("Доширак", 30);

        Basket mashaBasket = new Basket("Коловорот", 5000); // экземпляр класса

        vasyaBasket.print("Корзина Васи: ");
        petyaBasket.print("Корзина Пети: ");
        mashaBasket.print("Корзина Маши: ");
    }
}
