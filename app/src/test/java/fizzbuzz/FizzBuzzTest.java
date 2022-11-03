package fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {
  @Test public void knowsWhenNumberIsDivisibleByThree() {
    FizzBuzz fizzbuzz = new FizzBuzz();

    assertEquals(true, fizzbuzz.isDivisibleByThree(3));
  }

  @Test public void knowsWhenNumberIsNotDivisibleByThree() {
    FizzBuzz fizzbuzz = new FizzBuzz();

    assertEquals(false, fizzbuzz.isDivisibleByThree(1));
  }

  @Test public void knowsWhenNumberIsDivisibleByFive() {
    FizzBuzz fizzbuzz = new FizzBuzz();

    assertEquals(true, fizzbuzz.isDivisibleByFive(5));
  }

  @Test public void knowsWhenNumberIsNotDivisibleByFive() {
    FizzBuzz fizzbuzz = new FizzBuzz();

    assertEquals(false, fizzbuzz.isDivisibleByFive(1));
  }

  @Test public void returnsFizzWhenDivisibleByThree() {
    FizzBuzz fizzbuzz = new FizzBuzz();

    assertEquals("Fizz", fizzbuzz.fizzBuzzLabeller(3));
  }

  @Test public void returnsOneWhenNotDivisibleByThree() {
    FizzBuzz fizzbuzz = new FizzBuzz();

    assertEquals("1", fizzbuzz.fizzBuzzLabeller(1));
  }
}
