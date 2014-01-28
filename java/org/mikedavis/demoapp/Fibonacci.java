package org.mikedavis.demoapp;

/**
 * Fibonacci sequence calculator.
 *
 * @author mikedavis216@gmail.com (Mike Davis)
 */
public class Fibonacci {

  /**
   * computes fib(n)
   * <p> This is intentionally a non scalable function to generate some long running tests.
   */
  public int fibonacci(int n) {
    System.out.println("Computing fib " + n);
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    return fibonacci(n-1) + fibonacci(n-2);
  }
}
