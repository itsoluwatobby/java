package collections;

import java.util.*;

public class CollectionAPI {

    public static void main(String[] args) {
//        Collection<Integer> nums = new ArrayList<>();
//        List<Integer> nums = new ArrayList<>();
//        Set<Integer> nums = new HashSet<>(); // not sorted response
//        Set<Integer> nums = new TreeSet<>(); // sorted response
//        nums.add(6);
//        nums.add(5);
//        nums.add(35);
//        nums.add(52);
//        nums.add(6);
//        nums.add(2);
//        nums.add(14);

//        for (int num : nums) System.out.println(num);
//        Iterator<Integer> num = nums.iterator();
//        while (num.hasNext()) System.out.println(num.next());
//
//        Map<String, Integer> students = new HashMap<>();
//        Map<String, Integer> students = new HashTable<>(); // synchronised for multiple threads
//        students.put("John", 10);
//        students.put("Jane", 28);
//        students.put("Jack", 88);
//        students.put("Home", 118);
//        students.put("Mary", 42);
//
//        Set<String> keySets = students.keySet();
//        System.out.println(keySets);
//        for (String key : keySets) {
//            System.out.println(key + " : " + students.get(key));
//        }

//        Comparator<Integer> comparator = new Comparator<>() {
//            public int compare(Integer i, Integer j) {
//                if (i % 10 < j % 10) return 1;
//                return -1;
//            }
//        };

        Comparator<String> comparator = new Comparator<>() {
            @Override
            public int compare(String name1, String name2) {
                if (name1.length() > name2.length()) return 1;
                return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(1024);
        nums.add(225);
        nums.add(457);
        nums.add(88);
        nums.add(58);
        nums.add(2);

        List<String> names = new ArrayList<>();
        names.add("Matthew");
        names.add("Batholomew");
        names.add("Carol");
        names.add("Oluwatobiloba");
        names.add("Grace");
        Collections.sort(names, comparator);
        System.out.println(names);
    }
}
