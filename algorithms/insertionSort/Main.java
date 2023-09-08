package insertionSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = { 5, 6, 3, 2, 8, 7, 1 };
        // insertionSort(arr);
        int arrLength = arr.length;
        insertionSortRecursion(arr, arrLength);
        System.out.print(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }

    }

    static void insertionSortRecursion(int[] arr, int n) {

        if (n <= 1) {
            return;
        }

        insertionSortRecursion(arr, n - 1);

        int last = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;

    }

}
