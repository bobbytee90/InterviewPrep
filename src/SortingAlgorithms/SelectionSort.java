package SortingAlgorithms;

public class SelectionSort {

    private static void selectionSort(int[] input) {
        /* Select largest element and swap with Sorted list */
        int lastUnsortedIndex = input.length - 1;
        int largestIndex = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < lastUnsortedIndex; j++) {
                // Find largest element
                if (input[j] > input[largestIndex]) {
                    largestIndex = j;
                }
            }
            // Swap the largest element with lastUnsorted element if larger
            if (input[largestIndex] > input[lastUnsortedIndex]) {
                swap(input, largestIndex, lastUnsortedIndex);
            }
            largestIndex = 0;
            lastUnsortedIndex--;
        }
    }

    private static void swap(int[] array, int index1, int index2) {
        if (index1 == index2) {
            return;
        }
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String args[]) {
        int[] testArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.print("Unsorted: ");
        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }
        System.out.println();
        selectionSort(testArray);
        System.out.print("Sorted: ");
        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }
    }
}
