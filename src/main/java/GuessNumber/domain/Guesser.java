package GuessNumber.domain;

import java.util.Arrays;

import static GuessNumber.domain.ResultGenerator.RESULT_SIZE;

public class Guesser {

    private String result;

    public Guesser() {
        this(new ResultGenerator());
    }

    public Guesser(ResultGenerator generator) {
        result = generator.generateResult();
    }

    public String guess(String input) throws WrongInputException {
        checkInputFormat(input);

        int aNum = 0, bNum = 0;
        for (int i = 0; i < RESULT_SIZE; i++) {
            if (input.charAt(i) == result.charAt(i))
                aNum ++;
            else if (result.contains(String.valueOf(input.charAt(i))))
                bNum ++;
        }

        return String.format("%sA%sB", aNum, bNum);
    }

    private void checkInputFormat(String input) throws WrongInputException {
        if ((input.length() != RESULT_SIZE) || (Arrays.stream(input.split("")).distinct().count() != RESULT_SIZE)) {
            throw new WrongInputException();
        }
    }
}
