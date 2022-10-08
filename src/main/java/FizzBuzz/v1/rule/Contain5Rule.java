package FizzBuzz.v1.rule;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Contain5Rule implements Rule {
    @Override
    public boolean isMatch(int num) {
        return String.valueOf(num).contains("5");
    }

    @Override
    public String apply(int num) {
        return Stream.of(new BuzzRule(), new WhizzRule())
                .filter(rule -> rule.isMatch(num))
                .map(rule -> rule.apply(num))
                .collect(Collectors.joining());
    }
}
