package collections;

import java.util.*;

public class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student that) {
        if (this.age < that.age) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

class Main {
    public static void main(String[] args) {
//        Students student1 = new Students("John", 30);
//        Students student2 = new Students("Felix", 48);
//        Students student3 = new Students("Tourist", 52);
//        Students student4 = new Students("Green", 18);
//        Students student5 = new Students("Mat", 25);

        Comparator<Student> comparator = (s1, s2) -> s1.age < s2.age ? -1 : 0;

        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 30));
        students.add(new Student("Felix", 48));
        students.add(new Student("Tourist", 52));
        students.add(new Student("Green", 18));
        students.add(new Student("Mat", 25));
//        System.out.println(students);
//        sort based on age
        Collections.sort(students, comparator);
//        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
