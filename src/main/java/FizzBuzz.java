public class FizzBuzz {

    public String convert(int number) {
        if(isMultipleOf3(number) && isMultipleOf5(number)) return "FizzBuzz";
        else if(isMultipleOf3(number)) return "Fizz";
        else if(isMultipleOf5(number)) return "Buzz";
        return  String.valueOf(number);
    }

    private boolean isMultipleOf3(int number) {
        return number % 3 == 0;
    }

    private boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }
}
