package code_kata.handler;

/**
 * Created by WR on 2014/9/25.
 */
public class WhizzHandler extends WordHandler {
    public WhizzHandler(WordHandler successor){
        super(successor);
    }

    @Override
    public String handle(int num) {
        if(num % 7 == 0){
            return "Whizz";
        }else{
            return successor.handle(num);
        }
}
}
