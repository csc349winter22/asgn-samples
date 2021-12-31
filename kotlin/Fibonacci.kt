/**
 * Recursively computes Fibonacci numbers.
 * CSC 349, sample submission
 */

fun main(args: Array<String>) {
    /**
     * Computes the "[n]"th Fibonacci number.
     * @return The computed number
     */
    fun fib(n: Int): Int {
        return when {
            n < 0     -> -1
            n in 0..1 -> n
            else      -> fib(n - 1) + fib(n - 2)
        }
    }

    println(fib(args[0].toInt()))
}
