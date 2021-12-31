/**
 * Recursively computes Fibonacci numbers.
 * CSC 349, sample submission
 */

public class FibonacciNumberComputer
{
    public static void main(String[] args) {
        System.out.println(compute(Integer.parseInt(args[0])));
    }

    /**
     * Computes Fibonacci numbers.
     * @param n A non-negative integer
     * @return The "n"th number
     * @throws FibonacciNumberException If the "n"th number is undefined
     */
    public static int compute(int n) {
        if (n < 0) {
            throw new FibonacciNumberException(n);
        }
        else if (n == 0 || n == 1) {
            return n;
        }
        else {
            return compute(n - 1) + compute(n - 2);
        }
    }

    private static class FibonacciNumberException extends RuntimeException
    {
        private FibonacciNumberException(int n) {
            super("The Fibonacci number f(" + n + ") is not defined.");
        }
    }
}
