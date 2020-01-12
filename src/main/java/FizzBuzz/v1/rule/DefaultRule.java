package FizzBuzz.v1.rule;

import FizzBuzz.v1.WhizzRule;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DefaultRule implements Rule {
    @Override
    public boolean isMatch(int num) {
        return Stream.of(new FizzRule(), new BuzzRule(), new WhizzRule())
                .anyMatch(rule -> rule.isMatch(num));
    }

    @Override
    public String apply(int num) {
        return Stream.of(new FizzRule(), new BuzzRule(), new WhizzRule())
                .filter(rule -> rule.isMatch(num))
                .map(rule -> rule.apply(num))
                .collect(Collectors.joining());
    }
}
