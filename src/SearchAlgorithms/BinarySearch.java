package SearchAlgorithms;

public class BinarySearch {
    public static int binarySearchRecursive(int input[], int value, int start, int end) {
        int mid = (start + end) / 2;
        if (value == input[mid]) {
            System.out.println("Found " + value + " at " + mid);
            return mid;
        }

        if (start >= end || mid > end || mid < start) {
            System.out.println("Cannot find " + value);
            return -1;
        }

        if (value > input[mid]) {
            binarySearchRecursive(input, value, mid + 1, end);
        } else {
            binarySearchRecursive(input, value, start, mid - 1);
        }
        return -1;
    }

    public static int binarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length;
        int mid = (start + end) / 2;
        if (input[mid] == value) {
            System.out.println("Found " + value + " at " + mid);
            return mid;
        }
        while (start < end) {

            System.out.println("Mid " + input[mid]);
            if (input[mid] == value) {
                System.out.println("Found " + value + " at " + mid);
                return mid;
            }
            if (value > input[mid]) {
                start = mid;
                System.out.println("Array from " + start + " to " + end);
            } else {
                end = mid - 1;
                System.out.println("Array from " + start + " to " + end);
            }
            mid = (start + end) / 2;
        }
        System.out.println("Cannot find " + value);
        return -1;
    }


    public static void main(String args[]) {
        int[] testArray = {1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.print("Sorted: ");
        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }
        binarySearch(testArray, -1);
//        binarySearchRecursive(testArray,11,0,testArray.length);
    }
}
