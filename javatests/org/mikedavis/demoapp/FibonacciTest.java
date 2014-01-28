package org.mikedavis.demoapp;

import static junit.framework.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 *
 *
 * @author mikedavis@google.com (Mike Davis)
 */
@RunWith(JUnit4.class)
public class FibonacciTest {

  private Fibonacci fibonacci;

  @Before
  public void setUp() {
    fibonacci = new Fibonacci();
  }

  @Test
  public void fibZero() {
    assertEquals(1, fibonacci.fibonacci(0));
  }

  @Test
  public void fibOne() {
    assertEquals(1, fibonacci.fibonacci(1));
  }

  @Test
  public void fibTwo() {
    assertEquals(0, fibonacci.fibonacci(2));
  }
}
