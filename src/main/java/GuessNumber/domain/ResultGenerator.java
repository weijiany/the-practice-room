package GuessNumber.domain;

import java.util.HashSet;
import java.util.Random;
import java.util.stream.Collectors;

public class ResultGenerator {

    public static final int RESULT_SIZE = 4;
    public String generateResult() {
        return generateResult(new Random());
    }

    public String generateResult(Random random) {
        HashSet<Integer> set = new HashSet<>();

        while (set.size() != RESULT_SIZE) {
            set.add(random.nextInt(10));
        }

        return set.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
