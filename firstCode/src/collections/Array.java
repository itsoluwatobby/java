package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Array {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(15, 6, 17, 8, 11, 5, 6, 8, 5, 10);
//        List<Integer> newList = new ArrayList<>();

        Stream<Integer> stream = list.stream();
//        System.out.println(stream.reduce(Integer::sum));
        System.out.println(stream.reduce(0, (a, b) -> a + b));
//
//        System.out.println(stream.filter(a -> a > 10).sorted().toList());
//        for (Integer i : list) {
//            if (i % 2 == 0) i = i * 2;
//            System.out.println(i);
//            newList.add(i);
//        }
//        System.out.println(newList);

//        list.forEach(System.out::println);
//        list.forEach((val) -> System.out.println(val));
    }
}
