package c_JavaUtilFunction;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {

        Function<String, Integer> function = (string) -> string.replaceAll(" ", "").length();

        System.out.println(function.apply("Abdurrahman Dzaky Safrullah"));
    }
}
