import java.util.Scanner;

public class program {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        System.out.println("Введите треугольное число: ");
        int number = scanner.nextInt(); 
        
        int summa = findSum(number);
        System.out.println("Сумма: " + summa);
        
        int fact = findFact(number);
        System.out.println("Факториал: " + fact);
    }
    
    static int findSum(int number) {
        int summa = 0;
        for (int i = 1; i <= number; i++) {
            summa += i;
        }
        return summa;
    }
    static int findFact(int number) {
        int fact = 1;
        for(int i = 2; i <= number; i++){
            fact *= i;
        }
        return fact;
    }
}