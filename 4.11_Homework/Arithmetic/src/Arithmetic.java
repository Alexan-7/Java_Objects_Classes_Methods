public class Arithmetic {
    int number1;
    int number2;

    public Arithmetic(int number1, int number2) {
        this.number1 = number1; // сохраним переданные параметры...
        this.number2 = number2; // ...в переменных класса
    }

    public int sumOfNumbers() {
        int summa = number1 + number2;
        return summa;
    }

    public int multOfNumbers() {
        int multi = number1 * number2;
        return multi;
    }

    public int maxOfNumbers() {
        return number1 >= number2 ? number1 : number2;
    }

    public int minOfNumbers() {
        return number1 <= number2 ? number1 : number2;
    }
}
