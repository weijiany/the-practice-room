package FizzBuzz.v1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    private static Student student;

    @BeforeAll
    static void beforeAll() {
        student = new Student();
    }

    @Test
    void should_return_given_number_is_3_multiples() {
        String word = student.say(3);

        assertThat(word).isEqualTo("Fizz");
    }

    @Test
    void should_return_given_number_is_5_multiples() {
        String word = student.say(5);

        assertThat(word).isEqualTo("Buzz");
    }

    @Test
    void should_return_given_number_is_7_multiples() {
        String word = student.say(7);

        assertThat(word).isEqualTo("Whizz");
    }

    @Test
    void should_return_given_number_is_3_multiples_and_7_multiples() {
        String word = student.say(21);

        assertThat(word).isEqualTo("FizzWhizz");
    }

    @Test
    void should_return_given_number_is_only_contain_3() {
        String word = student.say(30);

        assertThat(word).isEqualTo("Fizz");
    }

    @Test
    void should_return_given_number_is_contain_5_and_is_7_multiples() {
        String word = student.say(35);

        assertThat(word).isEqualTo("BuzzWhizz");
    }

    @Test
    void should_return_given_number_is_contain_5_not_is_7_multiples() {
        String word = student.say(25);

        assertThat(word).isEqualTo("Buzz");
    }

    @Test
    void should_return_given_number_is_contain_7_not_is_7_multiples() {
        String word = student.say(75);

        assertThat(word).isEqualTo("Fizz");
    }

    @Test
    void should_return_given_number_is_contain_7_and_is_3_multiples() {
        String word = student.say(147);

        assertThat(word).isEqualTo("FizzWhizz");
    }
}
