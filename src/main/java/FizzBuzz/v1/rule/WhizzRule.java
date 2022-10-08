package FizzBuzz.v1.rule;

import FizzBuzz.NameConstant;
import FizzBuzz.v1.rule.Rule;

public class WhizzRule implements Rule {
    @Override
    public boolean isMatch(int num) {
        return num % 7 == 0;
    }

    @Override
    public String apply(int num) {
        return NameConstant.WHIZZ;
    }
}
