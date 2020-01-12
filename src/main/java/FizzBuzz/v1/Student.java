package FizzBuzz.v1;

import FizzBuzz.v1.rule.Contain3Rule;
import FizzBuzz.v1.rule.Contain5Rule;
import FizzBuzz.v1.rule.Contain7Rule;
import FizzBuzz.v1.rule.DefaultRule;

import java.util.stream.Stream;

public class Student {

    public String say(int num) {
        return Stream.of(new Contain7Rule(), new Contain5Rule(), new Contain3Rule(), new DefaultRule())
                .filter(rule -> rule.isMatch(num))
                .findFirst()
                .map(rule1 -> rule1.apply(num))
                .orElse(String.valueOf(num));
    }
}
