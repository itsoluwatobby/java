package arrayLists;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ArrayListDemo {
    public int CAPACITY = 10;
    public int size = 0;
    int[] array;

    public ArrayListDemo() {
        this.array = new int[this.CAPACITY];
    }

    public ArrayListDemo(int capacity) {
        this.array = new int[capacity];
        this.CAPACITY = capacity;
    }

    public void add(int value) {
//        check if array capacity is exhausted, if so, increment
        if (this.size == this.CAPACITY) {
//            copy previous array
            int[] copy = this.copyArray(this.array, this.CAPACITY, this.array.length);
//            set a new array with an increased capacity
            this.CAPACITY *= 2;
            this.array = this.copyArray(this.array, this.CAPACITY, copy.length);
        }
        this.array[this.size] = value;
        this.size++;
    }

//    public void add(String value) {
////        check if array capacity is exhausted, if so, increment
//        if (this.size == this.CAPACITY) {
////            copy previous array
//            int[] copy = this.copyArray(this.array, this.CAPACITY, this.array.length);
////            set a new array with an increased capacity
//            this.CAPACITY *= 2;
//            this.array = this.copyArray(this.array, this.CAPACITY, copy.length);
//        }
//        this.array[this.size] = value;
//        this.size++;
//    }

    public int pop() {
        int poppedValue = this.array[this.size - 1];
        int[] copy = this.copyArray(this.array, this.size, this.size);
        System.arraycopy(copy, 0, this.array, 0, this.size - 1);
        this.size--;
        return poppedValue;
    }

    private int[] copyArray(int[] array, int capacity, int length) {
        int[] copy = new int[capacity];
        System.arraycopy(array, 0, copy, 0, length);
        return copy;
    }

    public String values() {
        int[] values = this.copyArray(this.array, this.size, this.size);
        return Arrays.toString(values);
    }
}
