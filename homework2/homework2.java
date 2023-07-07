package homework2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class homework2 {
    public static void main(String[] args) {
        int[] array = {4, 2, 265, 334, 23, 1165, 0};
        bubbleSort(array);

        System.out.println("Отсортированный массив:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        try {
            File logFile = new File("/Users/anastasiamamulat/Desktop/JAVA/homework2");
            FileWriter fileWriter = new FileWriter(logFile);
            for (int i : array) {
                fileWriter.write(i + " ");
            }
            fileWriter.close();
            System.out.println("\nОтсортированный массив записан в файл 'log.txt'");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void bubbleSort(int[] arr) {
        int result = arr.length;

        for (int i = 0; i < result - 1; i++) {
            for (int j = 0; j < result - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
