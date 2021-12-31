/*
 * Recursively computes Fibonacci numbers.
 * CSC 349, sample submission
 */

#include <stdlib.h>
#include <stdio.h>

static int fib(int);

int main(int argc, char *argv[]) {
    printf("%d\n", fib(atoi(argv[1])));

    return 0;
}

/* fib: Computes the "n"th Fibonacci number. */
static int fib(int n) {
    if (n < 0) {
        return -1;
    }
    else if (n == 0 || n == 1) {
        return n;
    }
    else {
        return fib(n - 1) + fib(n - 2);
    }
}
