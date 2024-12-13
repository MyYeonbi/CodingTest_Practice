package array;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}