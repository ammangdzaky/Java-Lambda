package g_LambdaDiOptional;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class WithOptional {
    public static void main(String[] args) {

        sayHello("Dzaky");
        sayHello(null);
    }

    public static void sayHello(String name){

        Optional<String> optionalName = Optional.ofNullable(name);
        Optional<String> nameUpper = optionalName.map(String::toUpperCase);
        nameUpper.ifPresent(value -> System.out.println("HELLO" + value));

        // atau juga bisa cara satu baris

        Optional.ofNullable(name)
                .map(String::toUpperCase)
//                .ifPresent(value -> System.out.println("HELLO " + value));    -> hanya menegksekusi jika ada (bukan null)
                .ifPresentOrElse(value -> System.out.println("HELLO " + value), () -> System.out.println("HELLO TEMAN")); // -> jika tidak ada (null) eksekusi lambda kedua

        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("Teman");
        System.out.println("HELLO " + upperName);
    }
}
