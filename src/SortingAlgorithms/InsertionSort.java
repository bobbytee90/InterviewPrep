package SortingAlgorithms;

public class InsertionSort {

    private static void insertionSort(int[] input) {
        System.out.println("Insertion Sort");
        /* Select smallest element and insert in Sorted list */

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < input.length; firstUnsortedIndex++) {
            int insertElement = input[firstUnsortedIndex];
            for (int i = firstUnsortedIndex - 1; i >= 0; i--) {
                if (input[i] > insertElement) {
                    input[i + 1] = input[i];
                    input[i] = insertElement;
                }
            }
        }
    }

//    private static void insertionSortRecursive(int[] input,) {
//        System.out.println("Insertion Sort Recursive");
//        /* Select smallest element and insert in Sorted list */
//
//
//
//        for (int firstUnsortedIndex = 1; firstUnsortedIndex < input.length; firstUnsortedIndex++) {
//            int insertElement = input[firstUnsortedIndex];
//            for (int i = firstUnsortedIndex - 1; i >= 0; i--) {
//                if (input[i] > insertElement) {
//                    input[i + 1] = input[i];
//                    input[i] = insertElement;
//                }
//            }
//        }
//    }

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
//        insertionSortRecursive(testArray);
        System.out.print("Sorted: ");
        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }
    }
}
