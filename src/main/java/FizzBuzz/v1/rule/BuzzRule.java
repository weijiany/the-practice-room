package FizzBuzz.v1.rule;

import FizzBuzz.v1.NameConstant;

public class BuzzRule implements Rule {
    @Override
    public boolean isMatch(int num) {
        return num % 5 == 0;
    }

    @Override
    public String apply(int num) {
        return NameConstant.BUZZ;
    }
}
