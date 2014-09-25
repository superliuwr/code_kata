package code_kata;

/**
 * Created by WR on 2014/9/25.
 */
public class FizzBuzzGame {
    public static String handle(int num) {
        WordHandler wordHandler = new NormalWordHandler(null);
        WordHandler buzzHandler = new BuzzHandler(wordHandler);
        WordHandler fizzHandler = new FizzHandler(buzzHandler);
        WordHandler fizzBuzzHandler = new FizzBuzzHandler(fizzHandler);

        return fizzBuzzHandler.handle(num);
    }
}
