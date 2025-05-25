package e_LambdaDiCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEach {
    public static void main(String[] args) {

        Map<String, String> name = new HashMap<>();
        name.put("first", "Abdurrahman");
        name.put("middle", "Dzaky");
        name.put("last", "Safrullah");

        // for each biasa
        for (var entry: name.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // for each anonymosu class
        name.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " : " + value);
            }
        });


        // KODE : FOR EACH LAMBDA
        name.forEach((key, value) -> System.out.println(key + " : " + value));


    }
}
