import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // task 6
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст клиента");
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