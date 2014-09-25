package code_kata.handler;

/**
 * Created by WR on 2014/9/25.
 */
public class BuzzHandler extends WordHandler {
    public BuzzHandler(WordHandler successor) {
        super(successor);
    }

    @Override
    public String handle(int num) {
        if(num % 5 == 0){
            return "Buzz";
        }else{
            return successor.handle(num);
        }
    }
}
