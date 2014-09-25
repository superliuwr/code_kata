package code_kata.handler;

/**
 * Created by WR on 2014/9/25.
 */
public abstract class WordHandler {
    protected WordHandler successor;

    public WordHandler(WordHandler successor){
        this.successor = successor;
    }

    public abstract String handle(int num);
}
