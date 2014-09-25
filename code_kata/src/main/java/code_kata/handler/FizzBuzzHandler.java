package code_kata.handler;

/**
 * Created by WR on 2014/9/25.
 */
public class FizzBuzzHandler extends WordHandler {
    public FizzBuzzHandler(WordHandler successor) {
        super(successor);
    }

    @Override
    public String handle(int num){
        if(num % 15 == 0){
            return "FizzBuzz";
        }else{
            return successor.handle(num);
        }
    }
}
