import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void shouldReturnFizzWhenNumberIsMultipleOf3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 3;
        String result = fizzBuzz.convert(number);

        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzzWhenNumberIsMultipleOf5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 5;
        String result = fizzBuzz.convert(number);

        Assertions.assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnTheSameNumberWhenNumberIsNotMultipleOf3Or5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 7;
        String result = fizzBuzz.convert(number);

        Assertions.assertEquals("7", result);
    }

    @Test
    public void shouldReturnFizzBuzzWhenNumberIsMultipleOf3And5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 15;
        String result = fizzBuzz.convert(number);

        Assertions.assertEquals("FizzBuzz", result);
    }
}
