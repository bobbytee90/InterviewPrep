package Recursion;

public class PrimeNumber {

    // Given a number n, check whether it’s a prime number or not using recursion.

    // A number is prime only if it is not divisible by 1 and itself.
    public static boolean checkIfPrime(int number) {
        // Check for prime skipping 1, starting with 2.
        return checkIfPrime(number, 2);
    }

    private static boolean checkIfPrime(int number, int count) {
        // Return true if not divisible any other other number but itself.
        if (count == number) {
            return true;
        }
        // Divisible by another number
        if (number % count == 0) {
            System.out.println(number + " is divisible by " + count);
            return false;
        } else {
            // Check with the next divisor
            return checkIfPrime(number, count + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Is 4713247 prime? " + checkIfPrime(4713247));
        System.out.println("Is 33 prime? " + checkIfPrime(33));
        System.out.println("Is 23434 prime? " + checkIfPrime(23434));
        System.out.println("Is 17 prime? " + checkIfPrime(17));
    }

}
