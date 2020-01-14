package FizzBuzz.v2;

import FizzBuzz.NameConstant;

import java.util.function.Function;

public class Student {

    private Function<Integer, String> fizzCondition = num -> num % 3 == 0 ? NameConstant.FIZZ : "";
    private Function<Integer, String> buzzCondition = num -> num % 5 == 0 ? NameConstant.BUZZ : "";
    private Function<Integer, String> whizzCondition = num -> num % 7 == 0 ? NameConstant.WHIZZ : "";

    public String say(int num) {
        StringBuilder stringBuilder = new StringBuilder();

        if (String.valueOf(num).contains("7")) {
            stringBuilder.append(fizzCondition.apply(num));
            stringBuilder.append(whizzCondition.apply(num));
            return stringBuilder.toString();
        }

        if (String.valueOf(num).contains("5")) {
            stringBuilder.append(NameConstant.BUZZ);
            stringBuilder.append(whizzCondition.apply(num));
            return stringBuilder.toString();
        }

        if (String.valueOf(num).contains("3"))
            return NameConstant.FIZZ;

        stringBuilder.append(fizzCondition.apply(num));
        stringBuilder.append(buzzCondition.apply(num));
        stringBuilder.append(whizzCondition.apply(num));

        return stringBuilder.toString();
    }
}
