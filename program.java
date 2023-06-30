
// import java.util.Arrays;
// import java.util.Scanner;

// public class program{

//     static Scanner scanner = new Scanner(System.in);

//     public static void main(String[] args) {

//         boolean f = true;
//         while(f){
//             System.out.println("Укажите номер задачи:");
//             System.out.println("1 - Задача 1");
//             System.out.println("0 - Завершение работы приложения");
//             System.out.println("================================");
//             int no = Integer.parseInt(scanner.nextLine());

//             switch(no){

                
//                 case 1:
//                      // 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
//                     System.out.println("Введите треугольное число: ");
//                     int number = scanner.nextInt(); 
        
//                     int summa = findSum(number);
//                     System.out.println("Сумма: " + summa);
        
//                     int fact = findFact(number);
//                     System.out.println("Факториал: " + fact);
//                     break;

//                 case 0:
//                     System.out.println("Завершение рабоыт приложения.");
//                     f = false;
//                     break;
                
//                 default:
//                     System.out.println("Вы указали некорректный номер задачи.\nПовторите попытку ввода.");
//                 break;

//             }
//         }

//     }
//      // 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
//     static int findSum(int number) {
//         int summa = 0;
//         for (int i = 1; i <= number; i++) {
//             summa += i;
//         }
//         return summa;
//     }
//     static int findFact(int number) {
//         int fact = 1;
//         for(int i = 2; i <= number; i++){
//             fact *= i;
//         }
//         return fact;
//     }

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