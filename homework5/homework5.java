package homework5;

import java.util.ArrayList;
import java.util.HashMap;

public class homework5 {
    HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

    public void add(String surName, String number) {
        if (hashMap.containsKey(surName)) {
            ArrayList<String> numbers = hashMap.get(surName);
            numbers.add(number);
        } else {
            ArrayList<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(number);
            hashMap.put(surName, phoneNumbers);
        }
    }

    public ArrayList<String> get(String surName) {
        return hashMap.get(surName);
    }

    public static void main(String[] args) {
        homework5 phoneBook = new homework5();

        phoneBook.add("Иванов", "1234567890");
        phoneBook.add("Петров", "9876543210");
        phoneBook.add("Сидоров", "5555555555");
        phoneBook.add("Иванов", "1111111111");

        ArrayList<String> ivanovNumbers = phoneBook.get("Иванов");
        ArrayList<String> petrovNumbers = phoneBook.get("Петров");
        ArrayList<String> sidorovNumbers = phoneBook.get("Сидоров");
        
        System.out.println("Номера телефонов для фамилии Иванов: " + ivanovNumbers);
        System.out.println("Номера телефонов для фамилии Петров: " + petrovNumbers);
        System.out.println("Номера телефонов для фамилии Сидоров: " + sidorovNumbers);
    }
}