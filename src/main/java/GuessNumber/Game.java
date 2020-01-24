package GuessNumber;

import GuessNumber.domain.Guesser;
import GuessNumber.domain.WrongInputException;

import java.util.LinkedList;
import java.util.Scanner;

public class Game {

    private Guesser guesser = new Guesser();
    private final int GAME_LOOP = 6;
    private LinkedList<String> history = new LinkedList<>();

    public void run() {
        welcome();

        for (int i = 0; i < GAME_LOOP; i++) {
            String line = readLineFromConsole();
            try {
                String result = guesser.guess(line);
                if (isWin(result)) break;

                history.addFirst(result);
            } catch (WrongInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private boolean isWin(String result) {
        if (result.contains("4A")) {
            System.out.println("you win");
            return true;
        }
        System.out.println("current: " + result);
        return false;
    }

    private String readLineFromConsole() {
        Scanner scanner = new Scanner(System.in);
        if (!history.isEmpty())
            System.out.println("history: " + history);
        System.out.println("please input 4 number: ");
        return scanner.nextLine();
    }

    private void welcome() {
        System.out.println("welcome GuessNumber");
    }
}
