package GuessNumber.domain;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ResultGeneratorTest {

    @Test
    void should_not_has_duplicated_result() {
        Random mockRandom = mock(Random.class);
        when(mockRandom.nextInt(10)).thenReturn(1,1,2,3,4);

        ResultGenerator generator = new ResultGenerator();
        String actual = generator.generateResult(mockRandom);

        assertEquals("1234", actual);
    }
}