import java.util.Arrays;

class SearchAlgorithms {

    public int linearSearch(int[] array, int target) {
        if (array == null || array.length == 0) return -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return i;
        }
        return -1;
    }

    public int binarySearch(int[] array, int target) {
       if (array == null || array.length == 0) return -1;
       int start = 0;
       int end = array.length - 1;
       while (start <= end) {
          int mid = (start + end) / 2;
          if (array[mid] == target) return mid;
          else if (array[mid] > target) end = mid - 1;
          else start = mid  + 1;
       }
       return -1;
    }

    public int binarySearch(int[] array, int target, int start, int end) {
       if (array == null || array.length == 0) return -1;
       if (start <= end) {
           int mid = (start + end) / 2;
           if (array[mid] == target) return mid;
           else if (array[mid] < target) return binarySearch(array, target, mid + 1, end);
           return binarySearch(array, target, 0, mid - 1);
       }
       return -1;
    }
}

class SortingAlgorithms {

    public void bubbleSort(int[] array) {
        if (array == null || array.length == 0) return;
        int n = array.length;
        boolean isSwapped;

        for (int i = 0; i < n; i++) { // 0(n**2)
            isSwapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
    }
}

public class DSA {

    public static void main(String[] args) {
        int[] unsortedArray = { 13, 1, 4, 32, 5, 22, 40, 7, 45, 9 };
        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();
//        bubble sort
        sortingAlgorithms.bubbleSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }
//    public static void main(String[] args) {
//        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 }; // binary search only works on sorted arrays
//        SearchAlgorithms bs = new SearchAlgorithms();
//        int result = bs.binarySearch(array, 8, 0, array.length - 1);
//        int result2 = bs.linearSearch(array, 2);
//        String msg = "Element fount at index - ";
//        String binary = msg + result;
//        String linear = msg + result2;
//        System.out.println(result == -1 ? "Element not found" : binary);
//        System.out.println(result2 == -1 ? "Element not found" : linear);
//    }
}
