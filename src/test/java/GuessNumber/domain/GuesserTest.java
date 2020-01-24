package GuessNumber.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GuesserTest {

    private static String[][] guessTestData() {
        return new String[][] {
            {"1234", "4A0B"},
            {"1567", "1A0B"},
            {"2478", "0A2B"},
            {"0324", "1A2B"},
            {"5678", "0A0B"},
            {"4321", "0A4B"},
            {"1234", "4A0B"},
        };
    }

    @ParameterizedTest
    @MethodSource(value = "guessTestData")
    void should_return_correct(String guessNumber, String result) throws WrongInputException {
        ResultGenerator mockGenerator = mock(ResultGenerator.class);
        when(mockGenerator.generateResult()).thenReturn("1234");

        Guesser guesser = new Guesser(mockGenerator);
        String actual = guesser.guess(guessNumber);

        assertEquals(result, actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "12"})
    void should_throw_exception_when_input_has_error(String guessNumber) {
        WrongInputException exception = assertThrows(WrongInputException.class, () -> new Guesser().guess(guessNumber));
        assertEquals(exception.getMessage(), "Wrong Input, input again");
    }
}
