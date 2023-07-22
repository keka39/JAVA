package homework6;

import java.util.HashSet;

public class homework6 {
    public static void main(String[] args) {
HashSet<Cat> catSet = new HashSet<>();

        Cat cat1 = new Cat("Whiskers", 3, "gray");
        Cat cat2 = new Cat("Tom", 2, "black");
        Cat cat3 = new Cat("Whiskers", 3, "gray");

        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);

        System.out.println("Original set with duplicates:");
        for (Cat cat : catSet) {
            System.out.println(cat);
        }
}
}