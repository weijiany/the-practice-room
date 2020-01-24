package GuessNumber.domain;

public class WrongInputException extends Exception {
    public WrongInputException() {
        super("Wrong Input, input again");
    }
}
