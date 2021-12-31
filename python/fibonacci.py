# Recursively computes Fibonacci numbers.
# CSC 349, sample submission

import sys


def fib(n):
    """
    Compute a Fibonacci number.
    :param n: A non-negative integer
    :return: The "n"th number, or -1 if it is undefined
    """
    if n < 0:
        return -1
    elif n == 0 or n == 1:
        return n
    else:
        return fib(n - 1) + fib(n - 2)


if __name__ == "__main__":
    print(fib(int(sys.argv[1])))
