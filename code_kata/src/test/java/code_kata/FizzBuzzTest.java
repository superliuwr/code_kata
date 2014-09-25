package code_kata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by WR on 2014/9/25.
 */

@RunWith(JUnit4.class)
public class FizzBuzzTest {
    @Test
    public void given_1_should_say_1(){
        assert("Failure -- Given 1 should say 1.", "1", FizzBuzzHandler.handle(1));
    }
}
