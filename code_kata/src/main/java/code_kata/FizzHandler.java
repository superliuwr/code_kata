package code_kata;

/**
 * Created by WR on 2014/9/25.
 */
public class FizzHandler extends WordHandler {
    public FizzHandler(WordHandler successor) {
        super(successor);
    }

    @Override
    public String handle(int num) {
        if(num % 3 == 0){
            return "Fizz";
        }else{
            return successor.handle(num);
        }
    }
}
