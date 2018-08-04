package SortingAlgorithms;

public class MergeSort {

    private static void mergeSort(int[] input, int start, int end) {
        System.out.println("Merge Sort");
        /* Split into single element sorted arrays, then sort while merging */

        if (end - start < 2) {
            return;
        }

        // Split into single element arrays
        int midpoint = (start + end) / 2;
        mergeSort(input, start, midpoint);
        mergeSort(input, midpoint, end);

        // Merge
        mergeDescend(input, start, midpoint, end);
    }

    public static void merge(int[] input, int start, int midpoint, int end) {

        if (input[midpoint - 1] <= input[midpoint]) {
            return;
        }

        int i = start;
        int j = midpoint;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while (i < midpoint && j < end) {
            if (input[i] <= input[j]) {
                temp[tempIndex++] = input[i];
                i++;
            } else {
                temp[tempIndex++] = input[j];
                j++;
            }
        }

        // Copy left over elements
        System.arraycopy(input, i, input, start + tempIndex, midpoint - i);
        // Copy over sorted elements
        System.arraycopy(temp, 0, input, start, tempIndex);
    }


    public static void mergeDescend(int[] input, int start, int midpoint, int end) {

        if (input[midpoint - 1] > input[midpoint]) {
            return;
        }

        int i = start;
        int j = midpoint;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while (i < midpoint && j < end) {
            if (input[i] > input[j]) {
                temp[tempIndex++] = input[i];
                i++;
            } else {
                temp[tempIndex++] = input[j];
                j++;
            }
        }

        // Copy left over elements
        System.arraycopy(input, i, input, start + tempIndex, midpoint - i);
        // Copy over sorted elements
        System.arraycopy(temp, 0, input, start, tempIndex);
    }


    public static void main(String args[]) {
        int[] testArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.print("Unsorted: ");
        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }
        System.out.println();
        mergeSort(testArray, 0, testArray.length);
        System.out.print("Sorted: ");
        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }
    }
}
