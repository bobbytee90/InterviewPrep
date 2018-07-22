package SortingAlgorithms;

public class RadixSort {

    private static void stableCountingSort(int[] input, int position, int radix) {
        // Create count array
        int countArray[] = new int[radix];

        // Traverse input array and count occurrences
        for (int i = 0; i < input.length; i++) {
            // increment count array value at index of input array value
            countArray[getDigit(position, input[i], radix)]++;
        }

        // Adjust count array
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }


        int[] result = new int[input.length];
        for (int k = result.length - 1; k >= 0; k--) {
            result[--countArray[getDigit(position, input[k], radix)]] = input[k];
        }

        // Save for next iteration
        for (int i = 0; i < result.length; i++) {
            input[i] = result[i];
        }
    }

    public static int getDigit(int position, int value, int radix) {
        return (value / (int) Math.pow(10, position) % radix);
    }

    public static void radixSort(int[] input, int radix, int width) {
        System.out.println("Radix Sort");
        for (int i = 0; i < width; i++) {
            stableCountingSort(input, i, radix);
        }
    }

    public static void main(String args[]) {
        int[] testArray = {4725, 4586, 1330, 6792, 1594, 5729};
        System.out.print("Unsorted: ");
        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }
        System.out.println();
        radixSort(testArray, 10, 4);
        System.out.print("Sorted: ");
        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }

    }
}
