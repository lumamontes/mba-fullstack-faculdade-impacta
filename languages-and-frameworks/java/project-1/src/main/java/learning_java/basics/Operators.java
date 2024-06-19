package learning_java.basics;

public class Operators {
    public static void exec(){
       int result = 1 + 2 - 3 / 4 % 2;
       boolean less = 1 < 2;
       boolean more = 2 > 1;

       boolean isTrue = true && true;
       boolean isFalse = false && true;

       boolean mustBeTrue = false | true;
       boolean mustBeTrue2 = false || true;

       System.out.printf("Result: %s | Less: %s | More: %s | IsTrue: %s | IsFalse: %s | MustBeTrue: %s | MustBeTrue2: %s\n", result, less, more, isTrue, isFalse, mustBeTrue, mustBeTrue2);
    }
}