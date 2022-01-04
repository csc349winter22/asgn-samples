/**
 * Recursively computes Fibonacci numbers.
 * CSC 349, sample submission
 */

function fib(n:number): number {
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

console.log(fib(parseInt(process.argv[2])));
