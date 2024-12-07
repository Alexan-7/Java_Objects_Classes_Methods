public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.add("Butter", 12, 3);
        basket.add("Cucumber", 4, 33, 0.23);
        basket.print("Milk");
        basket.clear();
        basket.print("Корзина очищена");
    }
}

/**
 * в строке "Basket basket = new Basket();" слова:
 * "Basket" — это имя класса
 * "basket" — это переменная, которая ссылается на созданный объект
 * "new Basket();" — это создание нового экземпляра класса Basket.
 *
 * Столько одинаковых слов напоминает шутку:
 * В английском языке существует корректное предложение из 8 одинаковых слов подряд и без
 * знаков препинания: Buffalo buffalo Buffalo buffalo buffalo buffalo Buffalo buffalo.
 * Перевести его можно так:
 * «Бизоны из Баффало, напуганные другими бизонами из Баффало, пугают бизонов из Баффало».
 */