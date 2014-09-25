package code_kata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

/**
 * Created by WR on 2014/9/25.
 */

@RunWith(JUnit4.class)
public class FizzBuzzTest {
    @Test
    public void given_1_should_say_1(){
        assertEquals("Failure -- Given 1 should say 1.", "1", FizzBuzzGame.handle(1));
    }

    @Test
    public void given_3_should_say_3() {
        assertEquals("Failure -- Given 3 should say Fizz.", "Fizz", FizzBuzzGame.handle(3));
    }

    @Test
    public void given_5_should_say_5() {
        assertEquals("Failure -- Given 5 should say Buzz.", "Buzz", FizzBuzzGame.handle(5));
    }

    @Test
    public void given_15_should_say_15() {
        assertEquals("Failure -- Given 15 should say FizzBuzz.", "FizzBuzz", FizzBuzzGame.handle(15));
    }

    @Test
    public void given_7_should_say_7() {
        assertEquals("Failure -- Given 7 should say Whizz.", "Whizz", FizzBuzzGame.handle(7));
    }
}
