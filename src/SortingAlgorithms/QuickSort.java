package SortingAlgorithms;

public class QuickSort {

    private static void quickSort(int[] input, int start, int end) {
        System.out.println("Quick Sort");

        if (end - start < 2) {
            return;
        }
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {

        int pivotValue = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i < j && input[--j] >= pivotValue) ;
            if (i < j) {
                input[i] = input[j];
            }
            while (i < j && input[++i] <= pivotValue) ;
            if (i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivotValue;
        return j;
    }

    public static void main(String args[]) {
        int[] testArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.print("Unsorted: ");
        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }
        System.out.println();
        quickSort(testArray, 0, testArray.length);
        System.out.print("Sorted: ");
        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }
    }
}
