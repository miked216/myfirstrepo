package org.mikedavis.demoapp;

/**
 * Main class to run fibonacci sequence generator.
 *
 * @author mikedavis@google.com (Mike Davis)
 */
public class FibonacciRunner {

  private static final int SEQUENCE_LENGTH = 10;

  private final Fibonacci fibonacci;

  public FibonacciRunner(Fibonacci fibonacci) {
    this.fibonacci = fibonacci;
  }

  public void run(int max) {
    for (int i = 0; i < max; i++) {
      System.out.println(String.format("%3d: %4d", i, fibonacci.fibonacci(i)));
    }
  }

  public static void main(String[] args) {
    new FibonacciRunner(new Fibonacci()).run(SEQUENCE_LENGTH);
  }
}
