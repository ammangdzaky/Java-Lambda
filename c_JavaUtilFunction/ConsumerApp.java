package c_JavaUtilFunction;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {

        Consumer<String> consumer = (name) -> System.out.println("Hello " + name);

        consumer.accept("Dzaky");
    }
}
