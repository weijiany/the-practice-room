package FizzBuzz.v1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    private static Student student;

    @BeforeAll
    static void beforeAll() {
        student = new Student();
    }

    @Test
    void should_return_given_number_is_3_multiples() {
        String word = student.say(3);

        Assertions.assertEquals("Fizz", word);
    }

    @Test
    void should_return_given_number_is_5_multiples() {
        String word = student.say(5);

        Assertions.assertEquals("Buzz", word);
    }

    @Test
    void should_return_given_number_is_7_multiples() {
        String word = student.say(7);

        Assertions.assertEquals("Whizz", word);
    }

    @Test
    void should_return_given_number_is_3_multiples_and_7_multiples() {
        String word = student.say(21);

        Assertions.assertEquals("FizzWhizz", word);
    }

    @Test
    void should_return_given_number_is_only_contain_3() {
        String word = student.say(30);

        Assertions.assertEquals("Fizz", word);
    }

    @Test
    void should_return_given_number_is_contain_5_and_is_7_multiples() {
        String word = student.say(35);

        Assertions.assertEquals("BuzzWhizz", word);
    }

    @Test
    void should_return_given_number_is_contain_5_not_is_7_multiples() {
        String word = student.say(25);

        Assertions.assertEquals("Buzz", word);
    }

    @Test
    void should_return_given_number_is_contain_7_not_is_7_multiples() {
        String word = student.say(75);

        Assertions.assertEquals("Fizz", word);
    }

    @Test
    void should_return_given_number_is_contain_7_and_is_3_multiples() {
        String word = student.say(147);

        Assertions.assertEquals("FizzWhizz", word);
    }
}
