package e_LambdaDiCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {

        List<String> name = new ArrayList<String>();
        name.addAll(List.of("Abdurrahman", "Dzaky", "Safrullah"));

        // remove if anonymous class
        name.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String name) {
                return name.length() > 5;
            }
        });

        // KODE : REMOVE IF LAMBDA
        name.removeIf(n -> n.length() > 5);

        System.out.println(name);
    }
}
