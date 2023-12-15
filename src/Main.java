import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // task 1
        int firstNumber = 47;
        int secondNumber = 13;
        int difference = 47 / 13;
        int remainder = 47 % 13;
        System.out.println("Разность чисел " + firstNumber + " и " + secondNumber + " равна " + difference + " и " + remainder + " в остатке.");

        // task 2
        int number = 44;
        int sumOfNumber = number / 10 + number % 10;
        System.out.println("Сумма цифр числа " + number  + " равна " + sumOfNumber);

        // task 3
        int number2 = 345;
        int sumOfNumber2 = number2 / 100 + number2 / 10 + number2 % 10;
        System.out.println("Сумма цифр числа " + number2  + " равна " + sumOfNumber2);

        // task 4
        int firstShopping = 4899;
        int secondShopping = 157;
        float discount = (float) ((firstShopping + secondShopping) * 0.1);
        float check = (firstShopping + secondShopping) - discount;
        System.out.printf("\nСумма скидки = %.2f",  discount);
        System.out.printf("\nСумма чека = %.2f",  check);

        // task 5
        int orange = 73;
        int bananas = 95;
        float discount2 = 0.85F;
        float firstShopping2 = orange * 10 * discount2;
        float secongShopping2 = bananas * 2;
        float checkOfAllShoppings = firstShopping2 + secongShopping2;
        System.out.println("\n\nСумма всех покупок составила: " + checkOfAllShoppings + " рублей.");

        int champagne = 2870;
        float champagneDiscount = 0.5F;
        int broad = 27;
        float firstShopping3 = champagne * 7 * champagneDiscount;
        float checkOfAllShopping3 = firstShopping3 + broad;
        System.out.println("Сумма всех покупок составила: " + checkOfAllShopping3 + " рублей.");

        int champignon = 436;
        int ceps = 578;
        float cepsDiscount = 0.05F;
        double checkMushrooms = 2.5 * champignon + 3.75 * ceps * cepsDiscount;
        System.out.printf("\nСумма покупки грибов составила: %.2f  рублей.", checkMushrooms);

        // task 6.0
        double x = 0.40, y = 0.87;
        double intermediateResult = 11*x + y;
        System.out.printf("\n\nРезультат вычислений равен : %.15f", intermediateResult);
        double result = (x+10*y)- 15*(x/y);
        System.out.printf("\n\nРезультат вычислений равен : %.15f", result);

        // task 6
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nВведите возраст клиента");
        int age = scanner.nextInt();
        System.out.println("Введите размер зарплаты клиента");
        int salary = scanner.nextInt();
        int limit = 0;
        if (age >= 23) {
            limit = salary * 3;
        } else if (age < 23){
            limit = salary * 2;
        }

        if (salary >= 50_000) limit = (int) (salary >= 80_000 ? limit * 1.5 : limit * 1.2);
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");

        //task 7
        System.out.println("Введите размер желаемой суммы кредита");
        float rate = age <= 23? 11 : (float) (age <= 30 ? 10.5 : 10);
        if (salary >= 80_000) rate *= 0.7;
        int wantedSum = scanner.nextInt();
        float maxMonthlyPayment = salary / 2;
        float monthlyPayment = (wantedSum + (wantedSum * (rate / 100))) / 12;
        if (maxMonthlyPayment > monthlyPayment) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment+ " рублей. Платеж по кредиту " + monthlyPayment + " рублей. Одобрено");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment+ " рублей. Платеж по кредиту " + monthlyPayment + " рублей. Отказано");
        }

    }
}