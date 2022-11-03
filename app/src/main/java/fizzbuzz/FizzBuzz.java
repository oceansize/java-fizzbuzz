package fizzbuzz;

public class FizzBuzz {

  public boolean isDivisibleByThree(Integer number) {
    return number % 3 == 0;
  }

  public boolean isDivisibleByFive(Integer number) {
    return number % 5 == 0;
  }

  public String fizzBuzzLabeller(Integer number) {
    if(isDivisibleByThree(number)) {
      return "Fizz";
    }

    return Integer.toString(number);
  }
}
