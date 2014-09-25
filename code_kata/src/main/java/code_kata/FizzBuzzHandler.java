package code_kata;

/**
 * Created by WR on 2014/9/25.
 */
public class FizzBuzzHandler {
    public static String handle(int num) {
        if(num % 3 == 0){
            return "Fizz";
        }

        if(num % 5 == 0){
            return "Buzz";
        }

        return String.valueOf(num);
    }
}
