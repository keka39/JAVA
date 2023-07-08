

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Укажите номер задачи:");
            System.out.println("1 - Вычислить n-ое треугольное число и факториал");
            System.out.println("2 - Ввести все простые числа от 1 до 1000"); 
            System.out.println("3 - Реализовать простой калькулятор");
            System.out.println("0 - Завершение работы приложения");
            System.out.println("================================");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
            continue; // Пустая строка, продолжаем цикл
            }
            int no = Integer.parseInt(input);

            switch (no) {
                case 1:
                    //  1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
                    System.out.println("Введите треугольное число: ");
                    int number = Integer.parseInt(scanner.nextLine());

                    int sum = findSum(number);
                    System.out.println("Сумма: " + sum);

                    int factorial = findFactorial(number);
                    System.out.println("Факториал: " + factorial);
                    break;
                case 2:
                    // 2) Вывести все простые числа от 1 до 1000
                   printNums();
                break;
                case 3:
                    // 3) Реализовать простой калькулятор
                    double A;
                    double B;
                    char operator;
                    System.out.println("Введите первое число: ");
                    A = Double.parseDouble(scanner.nextLine());
                    System.out.println("Введите второе число: ");
                    B = Double.parseDouble(scanner.nextLine());
                    System.out.print("Введите оператор (+, -, *, /): ");
                    operator = scanner.next().charAt(0);
                    double result = calc(A, B, operator);
                    System.out.println(result);

                try {
                    File logFile = new File("calc.txt");
                    FileWriter fileWriter = new FileWriter(logFile);
                    fileWriter.write(A + " " + operator + " " + B + " = " + result);
                    fileWriter.close();
                    System.out.println("Результаты записаны в файл 'calc.txt'");
                    } catch (IOException ex) {
                         ex.printStackTrace();
                 }
                    
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

    static boolean simpleNum(int num){
        if(num <= 1){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    static void printNums(){
        for (int i = 2; i < 1000; i++) {
            if(simpleNum(i)){
            System.out.print((i + ", "));
            }
            }
            
        }
    
    static double calc(double A, double B, char operator) {
    double result = 0.0;

    switch (operator) {
        case '+':
            result = A + B;
            break;
        case '-':
            result = A - B;
            break;
        case '*':
            result = A * B;
            break;
        case '/':
            result = A / B;
            break;
        default:
            System.out.println("Нет такого оператора"); 
    }
    return result; 
}
}



