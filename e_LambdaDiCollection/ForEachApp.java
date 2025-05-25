package e_LambdaDiCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(List.of("Dzaky", "Asep", "Supri"));

        // for each biasa
        for (String name : names) {
            System.out.println(name);
        }

        // for each anonymous class
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });

        // KODE : LAMBDA FOR EACH
        names.forEach((name) -> System.out.println(name));

        // KODE : LAMBDA REFERENCE FOR EACH
        names.forEach(System.out::println);
    }
}
