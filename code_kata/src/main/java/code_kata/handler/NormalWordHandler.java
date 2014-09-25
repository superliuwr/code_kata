package code_kata.handler;

/**
 * Created by WR on 2014/9/25.
 */
public class NormalWordHandler extends WordHandler {
    public NormalWordHandler(WordHandler successor) {
        super(successor);
    }

    @Override
    public String handle(int num) {
        return String.valueOf(num);
    }
}
