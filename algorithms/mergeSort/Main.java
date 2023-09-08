package mergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = { 9, 2, 8, 3, 7, 4, 6, 5 };
        mergeSort(arr, 0, arr.length);
        System.out.print(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        mergeTwoSortedArrays(arr, start, mid, end);
    }

    static void mergeTwoSortedArrays(int[] arr, int start, int mid, int end) {
        int[] result = new int[end - start];
        int i = start, j = mid, k = 0;

        while (k < result.length && i < mid && j < end) {
            if (arr[i] <= arr[j]) {
                result[k] = arr[i];
                i++;
            } else {
                result[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < mid) {
            result[k] = arr[i];
            i++;
            k++;
        }
        while (j < end) {
            result[k] = arr[j];
            i++;
            k++;
        }

        for (int l = 0; l < result.length; l++) {
            arr[start + l] = result[l];
        }

    }
}
