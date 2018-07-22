package SortingAlgorithms;

public class ShellSort {

    private static void shellSort(int[] input) {
        System.out.println("Shell Sort");
        /* Insertion sort but with gaps */

        // Adjust Gap
        for (int gap = input.length / 2; gap >= 1; gap /= 2) {
            // Traverse by Gap
            for (int i = gap; i < input.length; i += gap) {
                //Shift
                int newElement = input[i];
                int j = i;

                while (j >= gap && input[j - gap] > newElement) {
                    input[j] = input[j - gap];
                    j -= gap;
                    System.out.println("shifting " + input[j]);
                }
                input[j] = newElement;
            }
        }


    }


    public static void main(String args[]) {
        int[] testArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.print("Unsorted: ");
        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }
        System.out.println();
        shellSort(testArray);
        System.out.print("Sorted: ");
        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }
    }
}
