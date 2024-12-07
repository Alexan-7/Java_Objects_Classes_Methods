import java.util.Scanner;

public class Main {
    /* ПАРАМЕТРЫ ПРОГРАММЫ */
    private static int minIncome = 200000;
    private static int maxIncome = 900000;

    private static int officeRentCharge = 140000;
    private static int telephonyCharge = 12000; // стоимость телефонии
    private static int internetAccessCharge = 7200;

    private static int assistantSalary = 45000; // зарплата ассистента
    private static int financeManageerSalary = 90000;

    private static double mainTaxPercent = 0.24;
    private static double managerPercent = 0.15; // видимо, бонусы

    private static double minInvestmentsAmount = 100000;

    public static void main(String[] args) {
        System.out.println("Программа рассчитывает доход компании и делает вывод о том, " +
                "может ли компания инвестировать какие-то деньги.");
        while (true) {
            System.out.println("Введите сумму доходов компании за месяц " +
                    "(от 200 до 900 тысяч рублей): ");
            int income = new Scanner(System.in).nextInt();

            if (!CheckIncomeRange(income)) {
                continue;
            }

            double managerSalary = income * managerPercent;
            double pureIncome = income - managerSalary -
                    calculateFixedCharges();
            double taxAmount = mainTaxPercent * pureIncome;
            double pureIncomeAfterTax = pureIncome - taxAmount;

            boolean canMakeInvestments = pureIncomeAfterTax >=
                    minInvestmentsAmount;

            System.out.println("Зарплата менеджера: " + managerSalary);
            System.out.println("Общая сумма налогов: " +
                    (taxAmount > 0 ? taxAmount : 0));
            System.out.println("Компания может инвестировать: " +
                    (canMakeInvestments ? "Да" : "Нет"));
            if (pureIncome < 0) {
                System.out.println("Бюджет в минусе! Нужно больше зарабатывать!");
            }
        }
    }

    /* проверяем, не выходит ли параметр income за пределы */
    private static boolean CheckIncomeRange(int income) {
        if (income < minIncome) {
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        if (income > maxIncome) {
            System.out.println("Доход выше нижней границы");
            return false;
        }
        return true;
    }

    /* рассчитываем суммарные фиксированные расходы */
    private static int calculateFixedCharges() {
        return officeRentCharge +
                telephonyCharge +
                internetAccessCharge +
                assistantSalary +
                financeManageerSalary;
    }
}