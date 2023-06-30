
import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Укажите номер задачи:");
            System.out.println("1 - Вычислить n-ое треугольное число и факториал");
            System.out.println("0 - Завершение работы приложения");
            System.out.println("================================");
            int no = Integer.parseInt(scanner.nextLine());

            switch (no) {
                case 1:
                    System.out.println("Введите число: ");
                    int number = Integer.parseInt(scanner.nextLine());

                    int sum = findSum(number);
                    System.out.println("Треугольное число: " + sum);

                    int factorial = findFactorial(number);
                    System.out.println("Факториал: " + factorial);
                    break;

                case 0:
                    System.out.println("Завершение работы приложения.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Вы указали некорректный номер задачи.\nПовторите попытку ввода.");
                    break;
            }
        }
    }
    static int findSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
    static int findFactorial(int number) {
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}