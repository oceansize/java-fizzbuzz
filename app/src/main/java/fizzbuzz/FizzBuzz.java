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
    StringBuilder accumulatedOutput = new StringBuilder(maximumNumber);

    for(Integer currentNumber = 1; currentNumber <= maximumNumber; currentNumber++) {

      if(maximumNumber == 1 || currentNumber == maximumNumber) {
        accumulatedOutput.append(fizzBuzzLabeller(currentNumber));
      }
      else {
        accumulatedOutput.append(fizzBuzzLabeller(currentNumber) + ", ");
      }
    };

    return accumulatedOutput.toString();
  }
}
