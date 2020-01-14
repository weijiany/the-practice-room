package FizzBuzz.v1.rule;

import FizzBuzz.NameConstant;

public class FizzRule implements Rule {
    @Override
    public boolean isMatch(int num) {
        return num % 3 == 0;
    }

    @Override
    public String apply(int num) {
        return NameConstant.FIZZ;
    }
}
