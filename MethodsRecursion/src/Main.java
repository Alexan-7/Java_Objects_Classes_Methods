public class Main {
    public static int i = 0;
    public static int max = 10;

    /**
     * Методы в Java принято именовать с маленькой буквы, и если имя метода
     * состоит из нескольких слов, то все эти слова необходимо писать слитно,
     * второе и каждое последующее слово начиная с большой буквы.
     */
    public static void iterate() {
        if (i < max) {
            i++;
            System.out.println(i);
            iterate();
        }
    }

    public static void main(String[] args) {
        iterate();
    }
}