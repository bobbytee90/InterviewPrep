package SortingAlgorithms;

public class CountingSort {

    private static void countingSort(int[] input) {
        // Create count array
        int countArray[] = new int[10];

        // Traverse input array and count occurrences
        for (int i = 0; i < input.length; i++) {
            // increment count array value at index of input array value
            countArray[input[i]]++;
        }

        int position = 0;
        // Traverse count array and rewrite values into input array
        for (int i = 0; i < countArray.length; i++) {
            while (countArray[i] > 0) {
                input[position] = i;
                countArray[i]--;
                position++;
            }
        }
    }

    public static void main(String args[]) {
        int[] testArray = {0, 1, 2, 2, 2, 4, 1, 4, 7, 0, 1, 4, 5, 9, 2, 4, 6, 7, 8};
        System.out.print("Unsorted: ");
        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }
        System.out.println();
        countingSort(testArray);
        System.out.print("Sorted: ");
        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }

    }
}
