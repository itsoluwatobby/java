import arrayLists.ArrayListDemo;

import java.util.Arrays;

// ADT - ABSTRACT DATA TYPE
public class Main {
    public static void main(String[] args) {
        ArrayListDemo arr = new ArrayListDemo(10);
        arr.add(5);
        arr.add(21);
        arr.add(33);
        arr.add(54);
        arr.add(5);
        arr.add(4);
        arr.add(10);

        arr.pop();
        arr.pop();
        arr.pop();

        arr.add(25);
        arr.add(78);

        System.out.println("size: " + arr.size);
        System.out.println("CAPACITY: " + arr.CAPACITY);

        System.out.println("Values: " + arr.values());
    }
}