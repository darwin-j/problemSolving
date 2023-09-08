package mergeTwoSortedArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = { 2, 4, 6, 8, 10 };
        int[] arr2 = { 1, 3, 5, 7 };

        int[] merged = mergeTwoSortedArrays(arr1, arr2);

        System.out.println(Arrays.toString(merged));
    }

    static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (k < result.length && i < n1 && j < n2) {

            if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n2) {
            result[k] = arr1[j];
            i++;
            k++;
        }

        return result;
    }
}
