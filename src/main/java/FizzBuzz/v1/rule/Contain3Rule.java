package FizzBuzz.v1.rule;

import FizzBuzz.v1.NameConstant;

public class Contain3Rule implements Rule {
    @Override
    public boolean isMatch(int num) {
        return String.valueOf(num).contains("3");
    }

    @Override
    public String apply(int num) {
        return NameConstant.FIZZ;
    }
}
