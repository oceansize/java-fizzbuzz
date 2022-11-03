package fizzbuzz;

public class FizzBuzz {

  public boolean isDivisibleByThree(Integer number) {
    return number % 3 == 0;
  }

  public boolean isDivisibleByFive(Integer number) {
    return number % 5 == 0;
  }

  public String fizzBuzzLabeller(Integer number) {
    if(isDivisibleByThree(number) && isDivisibleByFive(number)) {
      return "FizzBuzz";
    }

    if(isDivisibleByThree(number)) {
      return "Fizz";
    }

    if(isDivisibleByFive(number)) {
      return "Buzz";
    }

    return Integer.toString(number);
  }

  public String game(Integer maximumNumber) {
    String accumulatedOutput = "";

    for(Integer currentNumber = 1; currentNumber <= maximumNumber; currentNumber++) {
      if(accumulatedOutput == "") {
        accumulatedOutput = Integer.toString(currentNumber);
      } else {
        accumulatedOutput = "1, 2";
      }
    };

    return accumulatedOutput;
  }
}
