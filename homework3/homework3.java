package homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Iterator;


public class homework3 {

    static Random random = new Random();

    public static void main(String[] args) {
        task3();
    }

//     Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение
    static void task3() {
        int size = random.nextInt(10, 21);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(-9, 9));
        }
        System.out.println(arrayList);
        
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("Список после удаления четных чисел: " + arrayList);

        int minValue = Collections.min(arrayList);
        System.out.println("Минимальное значение: " + minValue);

        int maxValue = Collections.max(arrayList);
        System.out.println("Максимальное значение: " + maxValue);

        int sum = 0;
        for (int i : arrayList) {
            sum += i;
        }
        double average = (double) sum / arrayList.size();
        System.out.println("Среднее значение: " + average);

    }
}
