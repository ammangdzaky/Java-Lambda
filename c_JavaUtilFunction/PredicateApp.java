package c_JavaUtilFunction;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {

        Predicate<String> predicate = s -> s.isEmpty();

        String emptyString = "";
        String name = "Dzaky";

        System.out.println(predicate.test(emptyString));
        System.out.println(predicate.test(name));
    }
}
