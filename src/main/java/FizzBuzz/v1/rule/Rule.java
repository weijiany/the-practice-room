package FizzBuzz.v1.rule;

public interface Rule {
    boolean isMatch(int num);

    String apply(int num);
}
