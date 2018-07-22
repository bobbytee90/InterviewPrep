package SortingAlgorithms;

public class StableCountingSort {

    private static void stableCountingSort(int[] input) {
        // Create count array
        int countArray[] = new int[10];

        // Traverse input array and count occurrences
        for (int i = 0; i < input.length; i++) {
            // increment count array value at index of input array value
            countArray[input[i]]++;
        }

        // Adjust count array
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }


        int[] result = new int[input.length];
        for (int k = result.length - 1; k >= 0; k--) {
            result[--countArray[input[k]]] = input[k];
        }

        // Save for next iteration
        for (int i = 0; i < result.length; i++) {
            input[i] = result[i];
        }
    }


    public static void main(String args[]) {
        int[] testArray = {5, 6, 0, 2, 2, 4, 9};
        System.out.print("Unsorted: ");
        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }
        System.out.println();
        stableCountingSort(testArray);
        System.out.print("Sorted: ");
        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }

    }
}
