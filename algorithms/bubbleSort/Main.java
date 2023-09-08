package bubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 6, 7, 2, 6, 1 };
        // bubbleSort(arr);
        int arrLength = arr.length - 1;
        bubbleSortRecursion(arr, arrLength, 0);
        System.out.print(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    static void bubbleSortRecursion(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }

            bubbleSortRecursion(arr, row, col + 1);
        } else {
            bubbleSortRecursion(arr, row - 1, 0);
        }
    }

}