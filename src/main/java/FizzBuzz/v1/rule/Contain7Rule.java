package FizzBuzz.v1.rule;

import FizzBuzz.v1.WhizzRule;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Contain7Rule implements Rule {
    @Override
    public boolean isMatch(int num) {
        return String.valueOf(num).contains("7");
    }

    @Override
    public String apply(int num) {
        return Stream.of(new FizzRule(), new WhizzRule())
                .filter(rule -> rule.isMatch(num))
                .map(rule -> rule.apply(num))
                .collect(Collectors.joining());
    }
}
