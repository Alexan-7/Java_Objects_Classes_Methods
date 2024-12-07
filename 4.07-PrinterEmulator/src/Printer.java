public class Printer {
    String queue = ""; // список документов в очереди на печать
    int pagesInQueue = 0;
    int printedPages = 0;

    // 4.7 Перегрузка методов - задание
    public void append(String documText) {
        append(documText, "Документ без имени");
    }

    public void append(String documText, String documName) {
        queue += "\n" + documName + " - " + documText;
        pagesInQueue += 1;
    }

    public void append(String documText, int pagesCntInDoc) {
        append(documText, "Документ без имени", pagesCntInDoc);
    }

    public void append(String documText, String documName, int pagesCntInDoc) {
        queue += "\n" + documName + " - " + documText;
        pagesInQueue += pagesCntInDoc;
    }

    public void clear() {
        queue = "";
        pagesInQueue = 0;
    }

    public void print() {
        printedPages += pagesInQueue; // должно происходить увеличение значения переменной printedPages
        System.out.println(queue); // нам не надо выводить (queue + " - " + pagesInQueue + " стр.")
        clear();
    }

    public int getPendingPagesCount() { // Pending ~ Wait
        return pagesInQueue;
    }

    public int getPrintedPages() {
        // printedPages += pagesInQueue;
        return printedPages;
    }
}