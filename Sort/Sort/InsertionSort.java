package Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i-1;
            while (j > -1 && temp < array[j] ) {
                array[j+1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }
    // 4 2 6 5 1 3
    // temp = array [1] = 2, j = 0
    // array[1] = array[0] -> 4 4 6 5 1 3
    // array[0] = temp -> 2 4 6 5 1 3
    // j-- -> still j = 0
    // ...
    // i = 4 -> temp = array[4] = 1, j = 3
    // array[4] = array[3] -> 2 4 6 1 5 3
    // array[3] = temp = 1
    // j-- -> j = 2
    // duyet vong while tiep -> 2 4 1 6 5 3
    // 2 1 4 6 5 3
    // 1 2 4 6 5 3
    // 1 2 4 5 6 3
    // 1 2 3 4 5 6

    public static void main(String[] args) {
        int[] array = {4, 2, 6, 5, 1, 3};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
